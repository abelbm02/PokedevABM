package com.poke.dev;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int idTrainer;
    private String name;
    private String gender;
    private int age;
    private List<Medal> medals;
    private List<Item> items;
    private List<Pokemon> pokemons;

    // Constructor
    public Trainer(int idTrainer, String name, String gender, int age) {
        this.idTrainer = idTrainer;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.medals = new ArrayList<>();  // Inicializamos las listas vacías
        this.items = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    // Getters y setters
    public int getIdTrainer() {
        return idTrainer;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public List<Medal> getMedals() {
        return medals;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}