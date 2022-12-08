package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum Roman {

    I(1), IV(4);

    private int value;

    Roman(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<Roman> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((Roman e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}


