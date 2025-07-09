package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyflossSheepVariant {
    BLUE_RASPBERRY(0),
    PINK_VANILLA(1);
    private static final CandyflossSheepVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CandyflossSheepVariant::getId)).toArray(CandyflossSheepVariant[]::new);
    private final int id;
    CandyflossSheepVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CandyflossSheepVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
