import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_4_1Test {

    @Test
    void hex2Dec() {
        int[] num = {245, 0, 4387256, 15, 777777, -1, -245};
        String[] hex = {"F5", "0", "42F1B8", "F", "BDE31", "pkl*/", "-F5"};
        for (int i = 0; i < num.length; i++) {
            assertEquals(num[i],Ex2_4_1.hex2Dec(hex[i]));

        }

    }
}


