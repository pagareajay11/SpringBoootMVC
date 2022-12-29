package com.example.mvc.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.model.Product;
import com.example.mvc.repository.ProductRepository;
@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public void insert(Product p)
	{
		pr.save(p);
	}
	public Product getProduct(int id)
	{
		return pr.getById(id);
	}
	public List<Product> getAllProducts()
	{
		List<Product> l=pr.findAll();
		for(Product p:l)
			System.out.println(p);
		return l;
	}
	
	public void delete(int id)
	{
		pr.deleteById(id);
	}

}
