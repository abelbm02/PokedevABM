package com.poke.dev;

public enum Type {
    ELECTRIC("Electric", "Strong against Water"),
    WATER("Water", "Strong against Fire"),
    FIRE("Fire", "Strong against Grass"),
    GRASS("Grass", "Strong against Water");

    private final String name;
    private final String effectiveness;

    Type(String name, String effectiveness) {
        this.name = name;
        this.effectiveness = effectiveness;
    }

    public String getName() {
        return name;
    }

    public String getEffectiveness() {
        return effectiveness;
    }
}
