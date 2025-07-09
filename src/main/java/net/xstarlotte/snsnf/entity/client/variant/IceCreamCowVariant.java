package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum IceCreamCowVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    CHOCOLATE(2),
    LEMON(3),
    MANGO(4),
    ORANGE(5),
    PEACH(6),
    PINEAPPLE(7),
    RASPBERRY(8),
    STRAWBERRY(9),
    TOFFEE(10),
    VANILLA(11);
    private static final IceCreamCowVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(IceCreamCowVariant::getId)).toArray(IceCreamCowVariant[]::new);
    private final int id;
    IceCreamCowVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static IceCreamCowVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
