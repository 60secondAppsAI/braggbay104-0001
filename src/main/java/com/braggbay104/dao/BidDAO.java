package com.braggbay104.dao;

import java.util.List;

import com.braggbay104.dao.GenericDAO;
import com.braggbay104.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


