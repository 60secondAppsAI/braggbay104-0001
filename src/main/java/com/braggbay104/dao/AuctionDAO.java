package com.braggbay104.dao;

import java.util.List;

import com.braggbay104.dao.GenericDAO;
import com.braggbay104.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


