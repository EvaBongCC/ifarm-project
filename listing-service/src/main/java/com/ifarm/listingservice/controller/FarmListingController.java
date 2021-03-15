package com.ifarm.listingservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifarm.listingservice.entity.FarmListing;
import com.ifarm.listingservice.service.FarmListingService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FarmListingController {
	
	@Autowired
	private FarmListingService farmListingService;
	@RequestMapping(method = RequestMethod.POST, value = "/farmListing/add")
	public FarmListing saveListing(@RequestBody FarmListing form) {
		FarmListing farm= farmListingService.saveFarmListing(form);
		return farm;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/farmListing/{farmId}")
	public Optional<FarmListing> findFarmListingById(@PathVariable("farmId") Long farmId) {
		return farmListingService.findFarmListingById(farmId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/farmListing/retrieve")
	public List<FarmListing> findAllListing() {
		return farmListingService.findAllListing();
	}
	
}
