package com.braggbay104.dao;

import java.util.List;

import com.braggbay104.dao.GenericDAO;
import com.braggbay104.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


