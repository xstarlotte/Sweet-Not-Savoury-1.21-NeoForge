package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneCatVariant {
    APPLE(0),
    DEFAULT(1),
    ICE(2),
    PEPPER(3),
    SPEAR(4),
    WATERMELON(5);
    private static final CandyCaneCatVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyCaneCatVariant::getId)).toArray(CandyCaneCatVariant[]::new);
    private final int id;
    CandyCaneCatVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyCaneCatVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
