package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneflyVariant {
    DEFAULT(0);
    private static final CandyCaneflyVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyCaneflyVariant::getId)).toArray(CandyCaneflyVariant[]::new);
    private final int id;
    CandyCaneflyVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyCaneflyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
