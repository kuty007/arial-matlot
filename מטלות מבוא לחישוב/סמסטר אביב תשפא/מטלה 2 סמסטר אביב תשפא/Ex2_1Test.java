
import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class Ex2_Test {
     private static String grade;
     double grade = 0;
    double points = 5;


    @Test
    public void test1() {

        try {
            int[] arr = Ex2_1.primeDividers(1231);
            assertTrue(1231 == check_arr(Ex2_1.primeDividers(1231)));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        try {
            int[] arr = Ex2_1.primeDividers(11);
            assertTrue(11 == check_arr(Ex2_1.primeDividers(11)));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        try {
            int[] arr = Ex2_1.primeDividers(32);
            assertTrue(32 == check_arr(Ex2_1.primeDividers(32)));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {

        try {
            int[] arr = Ex2_1.primeDividers(23131);
            assertTrue(23131 == check_arr(Ex2_1.primeDividers(23131)));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test5() {
        try {
            int[] arr = Ex2_1.primeDividers(43212);
            assertTrue(43212 == check_arr(Ex2_1.primeDividers(43212)));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test6() {
        try {

            assertTrue(Ex2_2_1.isPerfect(33550336));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test7() {
        try {

            assertTrue(Ex2_2_1.isPerfect(8128));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test8() {
        try {

            assertFalse(Ex2_2_1.isPerfect(53));
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test9() {
        try {
            int[] arr1 = {6, 28, 496, 8128};
            int[] arr2 = Ex2_2_2.perfectNumbers(8888);
            int c = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        c++;
                        break;
                    }
                }
            }
            assertTrue(c == arr1.length);
            assertTrue(arr1.length == arr2.length);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test10() {
        try {
            int[] arr1 = new int[0];
            int[] arr2 = Ex2_2_2.perfectNumbers(5);
            int c = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        c++;
                        break;
                    }
                }
            }
            assertTrue(c == arr1.length);
            assertTrue(arr1.length == arr2.length);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test11() {
        try {

            assertTrue(Ex2_4_1.hex2Dec("7EA5") == 32421);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test12() {
        try {

            assertTrue(Ex2_4_1.hex2Dec("2C39") == 11321);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test13() {
        try {

            assertTrue(Ex2_4_1.hex2Dec("79ED") == 31213);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test14() {
        try {

            assertTrue(Ex2_4_1.hex2Dec("532!") == -1);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test15() {
        try {
            String s = "101C";
            assertTrue(Ex2_4_2.dec2Hex(4124).compareTo(s) == 0);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test16() {
        try {

            String s = "7987";
            assertTrue(Ex2_4_2.dec2Hex(31111).compareTo(s) == 0);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test17() {
        try {

            String s = "3C173";
            assertTrue(Ex2_4_2.dec2Hex(246131).compareTo(s) == 0);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test18() {
        try {

            String s = "1DD16";
            assertTrue(Ex2_4_2.dec2Hex(122134).compareTo(s) == 0);
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test19() {
        try {
            boolean[][] bool_arr = {
                    {false, false, false, false, false, false},
                    {false, false, false, false, false, false},
                    {false, false, true, true, true, false},
                    {false, true, true, true, false, false},
                    {false, false, false, false, false, false},
                    {false, false, false, false, false, false}};
            boolean[][] next1 =
                    {
                            {false, false, false, false, false, false},
                            {false, false, false, true, false, false},
                            {false, true, false, false, true, false},
                            {false, true, false, false, true, false},
                            {false, false, true, false, false, false},
                            {false, false, false, false, false, false}};
            boolean[][] next2 = NextGeneration.nextGeneration(bool_arr);
            for (int i = 0; i < next1.length; i++) {
                for (int j = 0; j < next1[0].length; j++) {
                    if (next1[i][j]) {
                        assertTrue(next2[i][j]);
                    } else assertFalse(next2[i][j]);
                }
            }
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test20() {
        try {
            boolean[][] bool_arr = {
                    {false, false, false, false, false, false},
                    {false, true, true, false, false, false},
                    {false, true, false, false, false, false},
                    {false, false, false, false, true, false},
                    {false, false, false, true, true, false},
                    {false, false, false, false, false, false}};
            boolean[][] next1 =
                    {
                            {false, false, false, false, false, false},
                            {false, true, true, false, false, false},
                            {false, true, true, false, false, false},
                            {false, false, false, true, true, false},
                            {false, false, false, true, true, false},
                            {false, false, false, false, false, false}};
            boolean[][] next2 = NextGeneration.nextGeneration(bool_arr);
            for (int i = 0; i < next1.length; i++) {
                for (int j = 0; j < next1[0].length; j++) {
                    if (next1[i][j]) {
                        assertTrue(next2[i][j]);
                    } else assertFalse(next2[i][j]);
                }
            }
            grade += points;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
     static void  check_nothing(){
        System.out.println("your grade is: "+grade);
        try {
            GameOfLife.gameOfLife(10,10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int check_arr(int arr[]) {
        if (arr == null) return -1;
        int c = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!is_prime(arr[i])) return -1;
            else c *= arr[i];
        }
        return c;
    }

    public static boolean is_prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

}

