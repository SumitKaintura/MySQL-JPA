package com.example.mysql.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.model.Product;
import com.example.mysql.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	
	@Override
	public boolean addProduct(Product product) 
	{
		
		if(productRepository.save(product)!=null)
		{
		return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public List<Product> getallProducts() 
	{
		
		List <Product> productlist=productRepository.findAll();
		return productlist;
	}

	@Override
	public Product getProduct(int productId) 
	{
		Product product =productRepository.getById(productId);
		return product;
	}

	@Override
	public boolean deleteProduct(int productId) 
	{
		productRepository.deleteById(productId);
		return true;
	}

	@Override
	public boolean updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}
