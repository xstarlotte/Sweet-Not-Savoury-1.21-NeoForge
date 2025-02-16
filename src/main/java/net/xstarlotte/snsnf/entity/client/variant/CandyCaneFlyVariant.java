package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneFlyVariant {
    APPLE(0),
    DEFAULT(1),
    ICE(2),
    PEPPER(3),
    SPEAR(4),
    WATERMELON(5);
    private static final CandyCaneFlyVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyCaneFlyVariant::getId)).toArray(CandyCaneFlyVariant[]::new);
    private final int id;
    CandyCaneFlyVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyCaneFlyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
