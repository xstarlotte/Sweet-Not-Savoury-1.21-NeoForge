package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneCrookVariant {
    DEFAULT(0),
    REVERSE(1);
    private static final CandyCaneCrookVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyCaneCrookVariant::getId)).toArray(CandyCaneCrookVariant[]::new);
    private final int id;
    CandyCaneCrookVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyCaneCrookVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
