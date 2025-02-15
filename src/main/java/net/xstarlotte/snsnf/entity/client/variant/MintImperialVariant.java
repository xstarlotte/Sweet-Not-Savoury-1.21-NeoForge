package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum MintImperialVariant {
    ONE(0),
    TWO(1),
    THREE(2),
    FOUR(3);
    private static final MintImperialVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(MintImperialVariant::getId)).toArray(MintImperialVariant[]::new);
    private final int id;
    MintImperialVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static MintImperialVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
