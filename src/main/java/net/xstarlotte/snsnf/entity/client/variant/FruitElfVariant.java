package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum FruitElfVariant {
    LEMON(0),
    LIME(1),
    MANGO(2),
    ORANGE(3),
    PEACH(4),
    PINEAPPLE(5);
    private static final FruitElfVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(FruitElfVariant::getId)).toArray(FruitElfVariant[]::new);
    private final int id;
    FruitElfVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static FruitElfVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
