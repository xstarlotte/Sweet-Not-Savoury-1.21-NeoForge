package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CheesecakeMouseVariant {
    STRAWBERRY(0);
    private static final CheesecakeMouseVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CheesecakeMouseVariant::getId)).toArray(CheesecakeMouseVariant[]::new);
    private final int id;
    CheesecakeMouseVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CheesecakeMouseVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
