package com.braggbay104.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuctionSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer auctionId;
	
	private Date startTime;
	
	private Date endTime;
	
	private Double startingBid;
	
	private Double highestBid;
	
}
