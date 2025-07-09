package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum BonbonbiniVariant {
    APPLE(0),
    BLACKBERRY(1),
    BLUEBERRY(2),
    LEMON(3),
    ORANGE(4),
    RASPBERRY(5),
    STRAWBERRY(6),
    TOFFEE(7);
    private static final BonbonbiniVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(BonbonbiniVariant::getId)).toArray(BonbonbiniVariant[]::new);
    private final int id;
    BonbonbiniVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static BonbonbiniVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
