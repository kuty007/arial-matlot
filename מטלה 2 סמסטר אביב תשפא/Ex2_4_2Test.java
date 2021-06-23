import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_4_2Test {

    @Test
    void dec2Hex() {
        int[] num = {245, 0, 4387256, 15, 777777,-245};
        String[] hex = {"F5", "0", "42F1B8", "F", "BDE31","-F5"};
        for (int i = 0; i < num.length; i++) {
            assertEquals(hex[i], Ex2_4_2.dec2Hex(num[i]));

        }

    }
}