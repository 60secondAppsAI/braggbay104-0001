package com.braggbay104.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay104.domain.OrderItem;
import com.braggbay104.dto.OrderItemDTO;
import com.braggbay104.dto.OrderItemSearchDTO;
import com.braggbay104.dto.OrderItemPageDTO;
import com.braggbay104.dto.OrderItemConvertCriteriaDTO;
import com.braggbay104.service.GenericService;
import com.braggbay104.dto.common.RequestDTO;
import com.braggbay104.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface OrderItemService extends GenericService<OrderItem, Integer> {

	List<OrderItem> findAll();

	ResultDTO addOrderItem(OrderItemDTO orderItemDTO, RequestDTO requestDTO);

	ResultDTO updateOrderItem(OrderItemDTO orderItemDTO, RequestDTO requestDTO);

    Page<OrderItem> getAllOrderItems(Pageable pageable);

    Page<OrderItem> getAllOrderItems(Specification<OrderItem> spec, Pageable pageable);

	ResponseEntity<OrderItemPageDTO> getOrderItems(OrderItemSearchDTO orderItemSearchDTO);
	
	List<OrderItemDTO> convertOrderItemsToOrderItemDTOs(List<OrderItem> orderItems, OrderItemConvertCriteriaDTO convertCriteria);

	OrderItemDTO getOrderItemDTOById(Integer orderItemId);







}





