package com.poke.dev;

public class Professor {
    private String name;
    private String gender;
    private int age;

    // Constructor
    public Professor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Método para entregar un Pokémon
    public void entregarInicial(Pokemon pokemon, Trainer trainer) {
        if (pokemon != null && trainer != null) {
            trainer.getPokemons().add(pokemon); // Agrega el Pokémon al entrenador
        }
    }

    // Getters
    public String getName() {
        return name;
    }
}