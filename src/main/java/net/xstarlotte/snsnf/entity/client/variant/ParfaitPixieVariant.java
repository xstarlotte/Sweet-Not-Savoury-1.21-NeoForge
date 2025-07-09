package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ParfaitPixieVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    CHOCOLATE(2),
    LEMON(3),
    ORANGE(4),
    RASPBERRY(5),
    STRAWBERRY(6),
    TOFFEE(7);
    private static final ParfaitPixieVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(ParfaitPixieVariant::getId)).toArray(ParfaitPixieVariant[]::new);
    private final int id;
    ParfaitPixieVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static ParfaitPixieVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
