package com.poke.dev;

import java.util.ArrayList;
import java.util.List;

public class RegionImpl implements Region {
    private int idRegion;
    private String name;
    private List<Gym> gyms;
    private List<Trainer> trainers;

    // Constructor
    public RegionImpl(int idRegion, String name) {
        this.idRegion = idRegion;
        this.name = name;
        this.gyms = new ArrayList<>();
        this.trainers = new ArrayList<>();
    }

    @Override
    public int getIdRegion() {
        return idRegion;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumGyms() {
        return gyms.size();
    }

    @Override
    public List<Gym> getGyms() {
        return gyms;
    }

    @Override
    public List<Trainer> getTrainers() {
        return trainers;
    }

    @Override
    public void agregarGym(Gym gym) {
        gyms.add(gym);
    }

    @Override
    public void agregarEntrenador(Trainer trainer) {
        trainers.add(trainer);
    }
}
