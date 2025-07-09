package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum WaferWitchVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    CHOCOLATE(2),
    LEMON(3),
    LIME(4),
    MANGO(5),
    ORANGE(6),
    PEACH(7),
    PINEAPPLE(8),
    RASPBERRY(9),
    STRAWBERRY(10),
    TOFFEE(11),
    VANILLA(12),
    WHITE_CHOCOLATE(13);
    private static final WaferWitchVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(WaferWitchVariant::getId)).toArray(WaferWitchVariant[]::new);
    private final int id;
    WaferWitchVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static WaferWitchVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
