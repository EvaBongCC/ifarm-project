package com.ifarm.listingservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifarm.listingservice.entity.FarmListing;
import com.ifarm.listingservice.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

}