package com.example.mysql.dao;

import java.util.List;

import com.example.mysql.model.Product;

public interface ProductService {
	
	public boolean addProduct(Product product);
	public List<Product> getallProducts();
	public Product getProduct(int productId);
	public boolean deleteProduct(int productId);
	public boolean updateProduct(int productId,Product product);

}
