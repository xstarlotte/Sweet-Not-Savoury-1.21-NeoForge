package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum TreatToadVariant {
    CHOCOLATE(0),
    HONEY(1),
    TOFFEE(2),
    WHITE_CHOCOLATE(3);
    private static final TreatToadVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(TreatToadVariant::getId)).toArray(TreatToadVariant[]::new);
    private final int id;
    TreatToadVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static TreatToadVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
