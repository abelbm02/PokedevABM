
import com.poke.dev.Gym;
import com.poke.dev.Medal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GymTest {

    private Gym gym;
    private Medal thunderBadge;

    @BeforeEach
    public void setUp() {
        thunderBadge = new Medal("Thunder Badge");
        gym = new Gym(1, "Pallet Town Gym", thunderBadge);
    }

    @Test
    public void testOtorgarMedalla() {
        // Comprobamos si el gimnasio tiene una medalla asociada
        assertNotNull(gym.getMedal(), "El gimnasio debería tener una medalla.");
        assertEquals("Thunder Badge", gym.getMedal().getName(), "La medalla otorgada no es la correcta.");
    }
}
