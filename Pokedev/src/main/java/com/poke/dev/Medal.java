package com.poke.dev;

public class Medal {
    private String name;
    private boolean obtained;

    // Constructor
    public Medal(String name) {
        this.name = name;
        this.obtained = false;
    }

    public void obtener() {
        this.obtained = true;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean isObtained() {
        return obtained;
    }
}
