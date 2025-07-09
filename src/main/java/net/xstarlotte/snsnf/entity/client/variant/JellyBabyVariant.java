package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum JellyBabyVariant {
    APPLE(0),
    BLACKBERRY(1),
    BLUEBERRY(2),
    LEMON(3),
    MANGO(4),
    ORANGE(5),
    PEACH(6),
    PINEAPPLE(7),
    RASPBERRY(8),
    STRAWBERRY(9);
    private static final JellyBabyVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(JellyBabyVariant::getId)).toArray(JellyBabyVariant[]::new);
    private final int id;
    JellyBabyVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static JellyBabyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
