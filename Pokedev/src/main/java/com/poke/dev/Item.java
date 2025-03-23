package com.poke.dev;

public class Item {
    private String name;
    private String type;

    // Constructor
    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Método para usar el item en un Pokémon
    public void usar(Pokemon pokemon) {
        // Lógica para usar el item
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
