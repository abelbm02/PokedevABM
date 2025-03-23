package com.poke.dev;

public enum Nature {
    HARDY("Hardy", "No effect"),
    BOLD("Bold", "Increases Defense"),
    ADAMANT("Adamant", "Increases Attack");

    private final String name;
    private final String statAffect;

    Nature(String name, String statAffect) {
        this.name = name;
        this.statAffect = statAffect;
    }

    public String getName() {
        return name;
    }

    public String getStatAffect() {
        return statAffect;
    }
}
