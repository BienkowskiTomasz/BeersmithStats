package com.yobombel.beersmithstats.controller;

import com.yobombel.beersmithstats.domain.entity.BeerBatch;
import com.yobombel.beersmithstats.service.BeerBatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BeerBatchController {

    private final BeerBatchService beerBatchService;

    @GetMapping("/")
    public Iterable<BeerBatch> findAll(){
        return beerBatchService.findAll();
    }


}
