package com.drifai.inventoryfailover.web;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drifai.inventoryfailover.model.BeerInventoryDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class InventoryFailover {
	
	 @GetMapping("/inventory-failover")
	 List<BeerInventoryDto> inventoryFailover() {
	   BeerInventoryDto mockInventory =  
	    		BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();
	   List<BeerInventoryDto> arrayList = new ArrayList<>();
	   arrayList.add(mockInventory);	   
	   return arrayList;
	 }

}
