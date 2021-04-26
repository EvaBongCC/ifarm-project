package com.ifarm.listingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifarm.listingservice.entity.Worker;
import com.ifarm.listingservice.repo.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker> findAllListing() {
		return workerRepository.findAll();
	}
}
