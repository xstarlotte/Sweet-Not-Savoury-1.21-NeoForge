package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SquirrollVariant {
    CINNAMON(0),
    CHOCOLATE(1),
    STRAWBERRY(2);
    private static final SquirrollVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(SquirrollVariant::getId)).toArray(SquirrollVariant[]::new);
    private final int id;
    SquirrollVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static SquirrollVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
