package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SugargliderVariant {
    DEFAULT(0);
    private static final SugargliderVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(SugargliderVariant::getId)).toArray(SugargliderVariant[]::new);
    private final int id;
    SugargliderVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static SugargliderVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
