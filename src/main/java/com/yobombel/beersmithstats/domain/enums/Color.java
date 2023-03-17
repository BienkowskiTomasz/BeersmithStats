package com.yobombel.beersmithstats.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Color {

    PALE("Pale", 0, 9),
    AMBER("Amber", 10, 19),
    DARK("Dark", 20, 200);

    private final String color;
    private final int minSrm;
    private final int maxSrm;

}