package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ChocolateChickenVariant {
    DARK(0),
    MILK(1),
    WHITE(2);
    private static final ChocolateChickenVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(ChocolateChickenVariant::getId)).toArray(ChocolateChickenVariant[]::new);
    private final int id;
    ChocolateChickenVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static ChocolateChickenVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
