package com.poke.dev;

import java.util.List;

public interface Region {
    // Métodos a implementar por las clases que representen regiones
    int getIdRegion();
    String getName();
    int getNumGyms();
    List<Gym> getGyms();
    List<Trainer> getTrainers();
    void agregarGym(Gym gym);
    void agregarEntrenador(Trainer trainer);
}
