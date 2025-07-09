package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GummyBearVariant {
    APPLE(0),
    BLACKBERRY(1),
    BLUEBERRY(2),
    CHERRY(3),
    COLA(4),
    LEMON(5),
    LIME(6),
    MANGO(7),
    ORANGE(8),
    PEACH(9),
    PINEAPPLE(10),
    RASPBERRY(11),
    STRAWBERRY(12);
    private static final GummyBearVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(GummyBearVariant::getId)).toArray(GummyBearVariant[]::new);
    private final int id;
    GummyBearVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static GummyBearVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
