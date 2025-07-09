package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyflossLionVariant {
    BLUE_RASPBERRY(0),
    PINK_VANILLA(1);
    private static final CandyflossLionVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyflossLionVariant::getId)).toArray(CandyflossLionVariant[]::new);
    private final int id;
    CandyflossLionVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyflossLionVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
