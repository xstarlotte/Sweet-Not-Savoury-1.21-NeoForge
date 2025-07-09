package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ChocolatePenguinVariant {
    DARK(0),
    MILK(1),
    WHITE(2);
    private static final ChocolatePenguinVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(ChocolatePenguinVariant::getId)).toArray(ChocolatePenguinVariant[]::new);
    private final int id;
    ChocolatePenguinVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static ChocolatePenguinVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
