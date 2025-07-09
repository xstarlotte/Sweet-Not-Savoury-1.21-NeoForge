package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GingerbreadManVariant {
    DEFAULT(0);
    private static final GingerbreadManVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(GingerbreadManVariant::getId)).toArray(GingerbreadManVariant[]::new);
    private final int id;
    GingerbreadManVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static GingerbreadManVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
