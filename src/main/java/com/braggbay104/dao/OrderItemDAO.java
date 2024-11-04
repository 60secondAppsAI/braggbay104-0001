package com.braggbay104.dao;

import java.util.List;

import com.braggbay104.dao.GenericDAO;
import com.braggbay104.domain.OrderItem;





public interface OrderItemDAO extends GenericDAO<OrderItem, Integer> {
  
	List<OrderItem> findAll();
	






}


