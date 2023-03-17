package com.yobombel.beersmithstats.domain.entity;

import com.yobombel.beersmithstats.domain.enums.Color;

import java.sql.Date;

public class Batch {

    private int number;
    private Date brewingDate;
    private String name;
    private String style;
    private Color color;
    private int amountInLiters;
    private double gravity;
    private double abv; //Alcohol By Volume

}