package com.niit.dao;

import java.util.List;

import com.niit.bean.Product;

public interface ProductDAO {
	public List<Product> list();

	public Product get(String id);

	public void saveOrUpdate(Product product);

	public void delete(Integer id);

}
