import com.poke.dev.Trainer;
import com.poke.dev.Pokemon;
import com.poke.dev.Medal;
import com.poke.dev.Nature;
import com.poke.dev.Type;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainerTest {

    private Trainer ash;
    private Pokemon pikachu;
    private Medal badge;

    @BeforeEach
    public void setUp() {
        ash = new Trainer(1, "Ash", "Male", 10);
        pikachu = new Pokemon(25, "Pikachu", 5, false, "Male", Nature.HARDY, Type.ELECTRIC, Type.WATER);
        badge = new Medal("Thunder Badge");
    }

    @Test
    public void testAgregarPokemon() {
        // Agregar Pokémon a un entrenador
        ash.getPokemons().add(pikachu);
        assertEquals(1, ash.getPokemons().size(), "El entrenador debería tener 1 Pokémon.");
    }

    @Test
    public void testObtenerMedalla() {
        // Agregar medalla al entrenador
        ash.getMedals().add(badge);
        assertTrue(ash.getMedals().contains(badge), "El entrenador debería tener la medalla.");
    }
}
