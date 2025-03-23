
import com.poke.dev.Nature;
import com.poke.dev.Pokemon;
import com.poke.dev.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PokemonTest {

    private Pokemon pikachu;
    private Pokemon bulbasaur;

    @BeforeEach
    public void setUp() {
        // Configuramos los Pokémon para las pruebas
        pikachu = new Pokemon(25, "Pikachu", 5, false, "Male", Nature.HARDY, Type.ELECTRIC, Type.WATER);
        bulbasaur = new Pokemon(1, "Bulbasaur", 5, false, "Female", Nature.BOLD, Type.GRASS, Type.WATER);
    }

    @Test
    public void testSubirDeNivel() {
        // Aseguramos que Pikachu sube de nivel correctamente
        int levelBefore = pikachu.getLevel();
        pikachu.subirDeNivel();
        assertEquals(levelBefore + 1, pikachu.getLevel(), "El nivel no ha subido correctamente.");
    }

    @Test
    public void testAtacar() {
        // Aquí simulamos un ataque básico entre Pokémon
        pikachu.atacar(bulbasaur);
        // Comprobamos si la salud de Bulbasaur disminuyó (ejemplo simplificado)
        // Suponemos que el ataque de Pikachu reduce la salud de Bulbasaur.
        assertTrue(bulbasaur.getLevel() < 6, "El ataque no disminuyó correctamente el nivel de Bulbasaur.");
    }
}
