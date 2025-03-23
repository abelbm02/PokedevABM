
import com.poke.dev.Gym;
import com.poke.dev.Medal;
import com.poke.dev.RegionImpl;
import com.poke.dev.Trainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegionTest {

    private RegionImpl region;
    private Gym gym;
    private Trainer ash;

    @BeforeEach
    public void setUp() {
        region = new RegionImpl(1, "Kanto");
        gym = new Gym(1, "Pallet Town Gym", new Medal("Thunder Badge"));
        ash = new Trainer(1, "Ash", "Male", 10);
    }

    @Test
    public void testAgregarGym() {
        region.agregarGym(gym);
        assertEquals(1, region.getGyms().size(), "La región no tiene el gimnasio agregado.");
        assertEquals("Pallet Town Gym", region.getGyms().get(0).getName(), "El gimnasio no tiene el nombre correcto.");
    }

    @Test
    public void testAgregarEntrenador() {
        region.agregarEntrenador(ash);
        assertEquals(1, region.getTrainers().size(), "La región no tiene el entrenador agregado.");
        assertEquals("Ash", region.getTrainers().get(0).getName(), "El entrenador no tiene el nombre correcto.");
    }
}
