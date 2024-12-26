package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CatVariant {
    DEFAULT(0),
    ICE(1),
    PEPPER(2),
    SPEAR(3),
    WATERMELON(4);
    private static final CatVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CatVariant::getId)).toArray(CatVariant[]::new);
    private final int id;
    CatVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CatVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
