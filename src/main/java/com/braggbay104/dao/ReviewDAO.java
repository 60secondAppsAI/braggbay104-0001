package com.braggbay104.dao;

import java.util.List;

import com.braggbay104.dao.GenericDAO;
import com.braggbay104.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


