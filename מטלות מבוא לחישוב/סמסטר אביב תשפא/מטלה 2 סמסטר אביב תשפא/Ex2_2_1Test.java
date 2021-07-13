import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Ex2_2_1Test {

    @Test
    void isPerfect() {
        assertFalse(Ex2_2_1.isPerfect(5));
        assertTrue(Ex2_2_1.isPerfect(6));
        assertTrue(Ex2_2_1.isPerfect(8128));
        assertFalse(Ex2_2_1.isPerfect(-4));
        assertFalse(Ex2_2_1.isPerfect(1));
        assertTrue(Ex2_2_1.isPerfect(496));
    }
}