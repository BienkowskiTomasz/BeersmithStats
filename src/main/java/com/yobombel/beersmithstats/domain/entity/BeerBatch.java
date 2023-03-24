package com.yobombel.beersmithstats.domain.entity;

import com.yobombel.beersmithstats.domain.enums.Color;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "batch")
public class BeerBatch {

    private static final String COLUMN_PREFIX = "b_";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = COLUMN_PREFIX + "number")
    private int number;

    @Column(name = COLUMN_PREFIX + "date")
    private Date brewingDate;

    @Column(name = COLUMN_PREFIX + "name")
    private String name;

    @Column(name = COLUMN_PREFIX + "style")
    private String style;

    @Enumerated(EnumType.STRING)
    @Column(name = COLUMN_PREFIX + "color")
    private Color color;

    @Column(name = COLUMN_PREFIX + "amount_liters")
    private int amountInLiters;

    @Column(name = COLUMN_PREFIX + "gravity")
    private double gravity;

    @Column(name = COLUMN_PREFIX + "abv")
    private double abv; //Alcohol By Volume

}