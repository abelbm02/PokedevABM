package com.poke.dev;

public class Gym {
    private int idGym;
    private String name;
    private Medal medal;

    // Constructor
    public Gym(int idGym, String name, Medal medal) {
        this.idGym = idGym;
        this.name = name;
        this.medal = medal;
    }

    // Getters
    public int getIdGym() {
        return idGym;
    }

    public String getName() {
        return name;
    }

    public Medal getMedal() {
        return medal;
    }
}
