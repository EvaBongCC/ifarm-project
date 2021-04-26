package com.ifarm.listingservice.repo;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ifarm.listingservice.entity.FarmListing;

@Repository
public interface FarmListingRepository extends JpaRepository<FarmListing, Long> {

	List<FarmListing> findByIsBook(boolean isBook);

	List<FarmListing> findByBookedBy(String farmerName);

	Integer countByType(String string);

	@Query("select count(*) from FarmListing where is_book = 1 and type = :name")
	Integer countByBookListingType(@Param("name") String name);

}
