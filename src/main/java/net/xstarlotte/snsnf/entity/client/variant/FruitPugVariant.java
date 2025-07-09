package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum FruitPugVariant {
    LEMON(0),
    LIME(1),
    MANGO(2),
    ORANGE(3),
    PEACH(4),
    PINEAPPLE(5);
    private static final FruitPugVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(FruitPugVariant::getId)).toArray(FruitPugVariant[]::new);
    private final int id;
    FruitPugVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static FruitPugVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
