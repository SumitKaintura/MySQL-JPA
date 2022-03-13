package com.example.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.dao.ProductServiceImpl;
import com.example.mysql.model.Product;
import com.example.mysql.repo.ProductRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	//ProductServiceImpl productservice = new ProductServiceImpl();
	@Autowired
    public ProductRepository productRepository;
	
/*	public ProductController(ProductServiceImpl productservice) {
		this.productservice = productservice;
	}*/
	
	@PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody Product product)
	{
		if(productRepository.save(product)!=null)
		{
			return new ResponseEntity<String>("Product Added",HttpStatus.OK);
		}
		else 
		{
			return new ResponseEntity<String>("Some Error Occured",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List <Product> productlist=productRepository.findAll();
		return new ResponseEntity<List<Product>>(productlist,HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{productid}")
	public ResponseEntity<String> deleteById(@PathVariable("productid")int productid)
	{
		productRepository.deleteById(productid);
		return new ResponseEntity<String>("Product Deleted",HttpStatus.OK);
	}
	
	
	
	
	
}
