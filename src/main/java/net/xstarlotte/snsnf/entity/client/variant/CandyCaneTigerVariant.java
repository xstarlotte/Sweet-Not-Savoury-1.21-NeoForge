package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneTigerVariant {
    DEFAULT(0);
    private static final CandyCaneTigerVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyCaneTigerVariant::getId)).toArray(CandyCaneTigerVariant[]::new);
    private final int id;
    CandyCaneTigerVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyCaneTigerVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
