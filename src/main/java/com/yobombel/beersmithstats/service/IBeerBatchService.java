package com.yobombel.beersmithstats.service;


import com.yobombel.beersmithstats.domain.entity.BeerBatch;

public interface IBeerBatchService {

    BeerBatch findByNumber(int number);
    Iterable<BeerBatch> findAll();
    void save(BeerBatch beerBatch);
    void delete(int number);

}