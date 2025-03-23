package com.poke.dev;

public class Pokemon {
    private int pokedexNum;
    private String name;
    private int level;
    private boolean shiny;
    private String gender;
    private Nature nature;
    private Type type;
    private Type subtype;

    // Constructor
    public Pokemon(int pokedexNum, String name, int level, boolean shiny, String gender, Nature nature, Type type, Type subtype) {
        this.pokedexNum = pokedexNum;
        this.name = name;
        this.level = level;
        this.shiny = shiny;
        this.gender = gender;
        this.nature = nature;
        this.type = type;
        this.subtype = subtype;
    }

    // Métodos
    public void subirDeNivel() {
        this.level++;
    }

    public void atacar(Pokemon otroPokemon) {
        // Lógica de combate basada en tipos, por ejemplo:
        if (this.type.getEffectiveness().equals("Strong against Water")) {
            // Reducir HP del otro Pokémon
        }
    }

    // Getters y setters
    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
