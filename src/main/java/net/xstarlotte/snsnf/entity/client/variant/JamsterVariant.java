package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum JamsterVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    RASPBERRY(2),
    STRAWBERRY(3);
    private static final JamsterVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(JamsterVariant::getId)).toArray(JamsterVariant[]::new);
    private final int id;
    JamsterVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static JamsterVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
