package com.yobombel.beersmithstats.domain.dto;

import com.yobombel.beersmithstats.domain.enums.Color;
import lombok.Data;

import java.sql.Date;

@Data
public class BeerBatchDTO {

    private Date brewingDate;
    private String name;
    private String style;
    private Color color;
    private int amountInLiters;
    private double gravity;
    private double abv; //Alcohol By Volume

}