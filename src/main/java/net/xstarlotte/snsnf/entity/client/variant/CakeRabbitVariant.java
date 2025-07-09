package net.xstarlotte.snsnf.entity.client.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CakeRabbitVariant {
    ANGEL(0),
    BANANA_BREAD(1),
    BANOFFEE_PIE(2),
    CARROT(3),
    CHOCOLATE_CHERRY(4),
    CHOCOLATE_ORANGE(5),
    COFFEE(6),
    FRUIT(7),
    LEMON_CURD(8),
    PEACH(9),
    RASPBERRY(10),
    RED_VELVET(11),
    STRAWBERRY(12),
    VANILLA(13),
    VICTORIA_SPONGE(14);
    private static final CakeRabbitVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CakeRabbitVariant::getId)).toArray(CakeRabbitVariant[]::new);
    private final int id;
    CakeRabbitVariant(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static CakeRabbitVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
