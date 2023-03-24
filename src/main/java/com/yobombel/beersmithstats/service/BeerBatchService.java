package com.yobombel.beersmithstats.service;

import com.yobombel.beersmithstats.domain.entity.BeerBatch;
import com.yobombel.beersmithstats.repository.BeerBatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BeerBatchService implements IBeerBatchService {

    private final BeerBatchRepository beerBatchRepository;

    @Override
    public BeerBatch findByNumber(int number) {
        return beerBatchRepository.findById(number)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Iterable<BeerBatch> findAll() {
        return beerBatchRepository.findAll();
    }

    @Override
    public void save(BeerBatch beerBatch) {
        beerBatchRepository.save(beerBatch);
    }

    @Override
    public void delete(int number) {
        beerBatchRepository.deleteById(number);
    }

}