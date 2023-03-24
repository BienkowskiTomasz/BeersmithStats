package com.yobombel.beersmithstats.service;

import com.yobombel.beersmithstats.domain.entity.BeerBatch;
import com.yobombel.beersmithstats.repository.BeerBatchRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


class BeerBatchServiceTest {

    @Mock
    private BeerBatchRepository beerBatchRepository;

    @InjectMocks
    private BeerBatchService beerBatchService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindByNumber() {
        BeerBatch expectedBeerBatch = new BeerBatch();
        expectedBeerBatch.setNumber(1);
        when(beerBatchRepository.findById(1)).thenReturn(Optional.of(expectedBeerBatch));

        BeerBatch actualBeerBatch = beerBatchService.findByNumber(1);

        assertThat(actualBeerBatch).isEqualTo(expectedBeerBatch);
    }

    @Test
    void testFindByNumberThrowsNoSuchElementException() {
        when(beerBatchRepository.findById(anyInt())).thenReturn(Optional.empty());

        assertThatThrownBy(() -> beerBatchService.findByNumber(1)).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void testFindAll() {
        List<BeerBatch> expectedBeerBatches = new ArrayList<>();
        BeerBatch beerBatch1 = new BeerBatch();
        beerBatch1.setNumber(1);
        BeerBatch beerBatch2 = new BeerBatch();
        beerBatch2.setNumber(2);
        expectedBeerBatches.add(beerBatch1);
        expectedBeerBatches.add(beerBatch2);
        when(beerBatchRepository.findAll()).thenReturn(expectedBeerBatches);

        Iterable<BeerBatch> actualBeerBatches = beerBatchService.findAll();

        assertThat(actualBeerBatches).containsExactlyElementsOf(expectedBeerBatches);
    }

    @Test
    void testSave() {
        BeerBatch expectedBeerBatch = new BeerBatch();
        expectedBeerBatch.setNumber(1);

        beerBatchService.save(expectedBeerBatch);

        verify(beerBatchRepository).save(expectedBeerBatch);
    }

    @Test
    void testDelete() {
        int expectedBeerBatchNumber = 1;

        beerBatchService.delete(expectedBeerBatchNumber);

        verify(beerBatchRepository).deleteById(expectedBeerBatchNumber);
    }


}