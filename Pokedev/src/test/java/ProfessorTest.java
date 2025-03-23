package com.poke.dev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    private Professor oak;
    private Trainer ash;
    private Pokemon bulbasaur;

    @BeforeEach
    public void setUp() {
        oak = new Professor("Oak", "Male", 60);
        ash = new Trainer(1, "Ash", "Male", 10);
        bulbasaur = new Pokemon(1, "Bulbasaur", 5, false, "Male", Nature.HARDY, Type.GRASS, Type.WATER);
    }

    @Test
    public void testEntregarPokemon() {
        oak.entregarInicial(bulbasaur, ash);
        assertTrue(ash.getPokemons().contains(bulbasaur), "El profesor no ha entregado correctamente el Pokémon.");
    }
}