package com.braggbay104.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay104.domain.Auction;
import com.braggbay104.dto.AuctionDTO;
import com.braggbay104.dto.AuctionSearchDTO;
import com.braggbay104.dto.AuctionPageDTO;
import com.braggbay104.dto.AuctionConvertCriteriaDTO;
import com.braggbay104.service.GenericService;
import com.braggbay104.dto.common.RequestDTO;
import com.braggbay104.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface AuctionService extends GenericService<Auction, Integer> {

	List<Auction> findAll();

	ResultDTO addAuction(AuctionDTO auctionDTO, RequestDTO requestDTO);

	ResultDTO updateAuction(AuctionDTO auctionDTO, RequestDTO requestDTO);

    Page<Auction> getAllAuctions(Pageable pageable);

    Page<Auction> getAllAuctions(Specification<Auction> spec, Pageable pageable);

	ResponseEntity<AuctionPageDTO> getAuctions(AuctionSearchDTO auctionSearchDTO);
	
	List<AuctionDTO> convertAuctionsToAuctionDTOs(List<Auction> auctions, AuctionConvertCriteriaDTO convertCriteria);

	AuctionDTO getAuctionDTOById(Integer auctionId);







}





