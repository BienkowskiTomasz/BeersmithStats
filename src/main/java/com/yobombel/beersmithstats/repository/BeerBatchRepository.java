package com.yobombel.beersmithstats.repository;

import com.yobombel.beersmithstats.domain.entity.BeerBatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerBatchRepository extends JpaRepository<BeerBatch, Integer> {
}