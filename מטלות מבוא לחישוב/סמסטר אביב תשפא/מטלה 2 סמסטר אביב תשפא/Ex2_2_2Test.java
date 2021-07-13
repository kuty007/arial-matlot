import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_2_2Test {

    @Test
    void perfectNumbers() {
        int [] prime ={6,28};
        assertEquals(Arrays.toString(prime), Arrays.toString(Ex2_2_2.perfectNumbers(32)));
        int [] prime1 ={};
        assertEquals(Arrays.toString(prime1), Arrays.toString(Ex2_2_2.perfectNumbers(1)));
        int [] prime2 ={6,28,496,8128};
        assertEquals(Arrays.toString(prime2), Arrays.toString(Ex2_2_2.perfectNumbers(8128)));
        int [] prime3 ={6,28,496};
        assertEquals(Arrays.toString(prime3), Arrays.toString(Ex2_2_2.perfectNumbers(652)));
        int [] prime4 ={6};
        assertEquals(Arrays.toString(prime4), Arrays.toString(Ex2_2_2.perfectNumbers(18)));
    }
}