import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex3_2_1Test {
    @Test
    void test2a() {
        boolean value = Ex3_2_1.isFormula("()");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test3b() {
        boolean value = Ex3_2_1.isFormula("(2+3)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test4c() {
        boolean value = Ex3_2_1.isFormula("(2+(3+5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test5d() {
        boolean value = Ex3_2_1.isFormula("((2+(3-5))+5)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }




    @Test
    void test10e() {
        boolean value = Ex3_2_1.isFormula("()");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test11f() {
        boolean value = Ex3_2_1.isFormula("1");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test12g() {
        boolean value = Ex3_2_1.isFormula("-1");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }



    @Test
    void test14h() {
        boolean value = Ex3_2_1.isFormula("((1+5))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test15j() {
        boolean value = Ex3_2_1.isFormula("(((1+5)))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test16w() {
        boolean value = Ex3_2_1.isFormula("(4+*(3+x)*(4-5))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test17rr() {
        boolean value = Ex3_2_1.isFormula("( (4+6+x)*(4-5)) ");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test18rrrr() {
        boolean value = Ex3_2_1.isFormula("((4+6+x)*(4-5)) ");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test19wwww() {
        boolean value = Ex3_2_1.isFormula("( (4+6+x)*(4-5)) ");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test20ssss() {
        boolean value = Ex3_2_1.isFormula("-1");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test21dddd() {
        boolean value = Ex3_2_1.isFormula("4+3");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }


    @Test
    void test23dddd() {
        boolean value = Ex3_2_1.isFormula("78");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test24aaaaa() {
        boolean value = Ex3_2_1.isFormula("((2+1))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test25xxxx() {
        boolean value = Ex3_2_1.isFormula("(4*((4+x)+2))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test26cc() {
        boolean value = Ex3_2_1.isFormula("((3+1)*(9-2))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test27v() {
        boolean value = Ex3_2_1.isFormula("((x+1)*(9-2))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }


    @Test
    void test29bbb() {
        boolean value = Ex3_2_1.isFormula("(((7*x)+(3+x))*(4-5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test30nnn() {
        boolean value = Ex3_2_1.isFormula("(((#*$)+(@+y))*(q-z))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test31aaa() {

        boolean value = Ex3_2_1.isFormula("2+)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }


    @Test
    void test33qqq() {//
        boolean value = Ex3_2_1.isFormula("(((7*x)+(3+x))*(4-5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test34eeee() {
        boolean value = Ex3_2_1.isFormula("((5-4)*((3+x)+(7*x)))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test35ssss() {
        boolean value = Ex3_2_1.isFormula("(((((((5+(5+(5+(5+(5+(5+(5+(5+5))))))))+5)+5)+5)+5)+5)+9)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test36aaaa() {

        boolean value = Ex3_2_1.isFormula("(+)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test37nnnn() {

        boolean value = Ex3_2_1.isFormula("(*+*)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test3dev_1() {
        boolean value = Ex3_2_2.checkPowerThree(78733);
        boolean num = true;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_3() {
        boolean value = Ex3_2_2.checkPowerThree(-1);
        boolean num = false;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_4() {
        boolean value = Ex3_2_2.checkPowerThree(4782997);
        boolean num = true;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_5() {
        boolean value = Ex3_2_2.checkPowerThree(7);
        boolean num = false;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_6() {
        boolean value = Ex3_2_2.checkPowerThree(118098);
        boolean num = false;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_7() {
        boolean value = Ex3_2_2.checkPowerThree(28);
        boolean num = true;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_8() {
        boolean value = Ex3_2_2.checkPowerThree(3);
        boolean num = true;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_9() {
        boolean value = Ex3_2_2.checkPowerThree(1);
        boolean num = true;
        Assertions.assertEquals(value, num);
    }

    @Test
    void test3dev_10() {
        boolean value = Ex3_2_2.checkPowerThree(43105774);
        boolean num = true;
        Assertions.assertEquals(value, num);
    }

    @Test
    void assignTest1mmmm() {
        double value = Ex3_2_1.assign("(2+x)", 3);
        double expected = 5;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest2mm() {
        double value = Ex3_2_1.assign("((2+1))", 0);
        double expected = Double.NaN;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest3() {
        double value = Ex3_2_1.assign("(5+((3+x)*(4-5)))", 2);
        double expected = 0.0;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest4() {
        double value = Ex3_2_1.assign("((1*x)+((2+1)*(5-4)))", 10);
        double expected = 13;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest5() {
        double value = Ex3_2_1.assign("(((3+1)*(2-9))+((2-4)+(4+3)))", 3);
        double expected = -23;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest6() {
        double value = Ex3_2_1.assign("((3-9)*x)", 4);
        double expected = -24;
        Assertions.assertEquals(value, expected);
    }
    @Test
    public void test1() {
        boolean value = Ex3_2_1.isFormula("");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test2() {
        boolean value = Ex3_2_1.isFormula("()");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test3() {
        boolean value = Ex3_2_1.isFormula("(2+3)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test4() {
        boolean value = Ex3_2_1.isFormula("(2+(3+5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test5() {
        boolean value = Ex3_2_1.isFormula("((2+(3-5))+5)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test6() {
        boolean value = Ex3_2_1.isFormula("(((2+(3%5))+5)*9)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test7() {
        boolean value = Ex3_2_1.isFormula("((2%5)+(9+3))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test8() {
        boolean value = Ex3_2_1.isFormula("(((2%5)+(9+3))+(2+9))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test9() {
        boolean value = Ex3_2_1.isFormula("(((2%5)+(9+3))+(-2+9))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test10() {
        boolean value = Ex3_2_1.isFormula("()");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test11() {
        boolean value = Ex3_2_1.isFormula("1");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test12() {
        boolean value = Ex3_2_1.isFormula("-1");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test13() {
        boolean value = Ex3_2_1.isFormula(null);
        boolean expected = false;
        Assertions.assertEquals(false, value);
    }

    @Test
    void test14() {
        boolean value = Ex3_2_1.isFormula("((1+5))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test15() {
        boolean value = Ex3_2_1.isFormula("(((1+5)))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test16() {
        boolean value = Ex3_2_1.isFormula("(4+*(3+x)*(4-5))");
        boolean expected = false;
        Assertions.assertEquals(false, value);
    }

    @Test
    void test17() {
        boolean value = Ex3_2_1.isFormula("( (4+6+x)*(4-5)) ");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test18() {
        boolean value = Ex3_2_1.isFormula("((4+6+x)*(4-5)) ");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test19() {
        boolean value = Ex3_2_1.isFormula("( (4+6+x)*(4-5)) ");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test20() {
        boolean value = Ex3_2_1.isFormula("-1");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test21() {
        boolean value = Ex3_2_1.isFormula("4+3");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test22() {
        boolean value = Ex3_2_1.isFormula("(21+3)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test23() {
        boolean value = Ex3_2_1.isFormula("78");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test24() {
        boolean value = Ex3_2_1.isFormula("((2+1))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test25() {
        boolean value = Ex3_2_1.isFormula("(4*((4%x)+2))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test26() {
        boolean value = Ex3_2_1.isFormula("((3+1)*(9-2))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test27() {
        boolean value = Ex3_2_1.isFormula("((x+1)*(9-2))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test28() {
        boolean value = Ex3_2_1.isFormula("(((7*x)+(3+x))*(4-5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test29() {
        boolean value = Ex3_2_1.isFormula("(((7*x)+(3+x))*(4-5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test30() {
        boolean value = Ex3_2_1.isFormula("(((#*$)+(@+y))*(q-z))");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test31() {

        boolean value = Ex3_2_1.isFormula("2+)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }
    /*
            @Test
            void test32() {

                boolean value = Ex3_2_1.isFormula(" ((5-4)*((3+x)+(7*x)))");
                boolean expected = true;
                Assertions.assertEquals(expected, value);
            }
    */
    @Test
    void test33() {//
        boolean value = Ex3_2_1.isFormula("(((7*x)+(3+x))*(4-5))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test34() {
        boolean value = Ex3_2_1.isFormula("((5-4)*((3+x)+(7*x)))");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test35() {
        boolean value = Ex3_2_1.isFormula("(((((((5+(5+(5+(5+(5+(5+(5+(5+5))))))))+5)+5)+5)+5)+5)+9)");
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test36() {

        boolean value = Ex3_2_1.isFormula("(+)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test37() {

        boolean value = Ex3_2_1.isFormula("(*+*)");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }
    @Test
    public void test38() {

        boolean value = Ex3_2_1.isFormula(")9+7(");
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    ///////// **********************************************************************
    @Test
    void assignTest1() {
        double value = Ex3_2_1.assign("(x+9)", 3);
        double expected = 12;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest2() {
        double value = Ex3_2_1.assign("(5+((2+1))+5)", 0);
        double expected = Double.NaN;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest11() {
        double value = Ex3_2_1.assign("(2+x)", 3);
        double expected = 5;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest21() {
        double value = Ex3_2_1.assign("((2+1))", 0);
        double expected = Double.NaN;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest31() {
        double value = Ex3_2_1.assign("(5+((3+x)*(4-5)))", 2);
        double expected = 0;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest41() {
        double value = Ex3_2_1.assign("((1*x)+((2+1)*(5-4)))", 10);
        double expected = 13;
        Assertions.assertEquals(value, expected);
    }

    @Test
    void assignTest51() {
        double value = Ex3_2_1.assign("(((3+1)*(2-9))+((2-4)+(4+3)))", 3);
        double expected = -23;
        Assertions.assertEquals(value, expected);
    }
    /*************************************************************************/

    @Test
    public void test1222() {
        boolean value = Ex3_2_2.checkPowerThree(59050);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test2222() {
        boolean value = Ex3_2_2.checkPowerThree(999);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test32() {
        boolean value = Ex3_2_2.checkPowerThree(66339);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test42() {
        boolean value = Ex3_2_2.checkPowerThree(9);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test52() {
        boolean value = Ex3_2_2.checkPowerThree(91);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test62() {
        boolean value = Ex3_2_2.checkPowerThree(0);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test72() {
        boolean value = Ex3_2_2.checkPowerThree(1);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test82() {
        boolean value = Ex3_2_2.checkPowerThree(-1);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test92() {
        boolean value = Ex3_2_2.checkPowerThree(-999);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test102() {
        boolean value = Ex3_2_2.checkPowerThree(2);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test1122() {
        boolean value = Ex3_2_2.checkPowerThree(6);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test122() {
        boolean value = Ex3_2_2.checkPowerThree(4);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test132() {
        boolean value = Ex3_2_2.checkPowerThree(2189);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test142() {
        boolean value = Ex3_2_2.checkPowerThree(531441);
        boolean expected = true;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void test152() {
        boolean value = Ex3_2_2.checkPowerThree(531443);
        boolean expected = false;
        Assertions.assertEquals(expected, value);
    }
    @Test
    void Ex3_1() // mod function
    {
        System.out.println("Ex3_1 Test:");
        int m = 10;
        int n = 2;
        assertEquals(Ex3_3_1.mod(m, n), (m%n));
        System.out.println(m + " % " + n + " = " + Ex3_3_1.mod(m, n));
        m = 25;
        n = 4;
        assertEquals(Ex3_3_1.mod(m, n), (m%n));
        System.out.println(m + " % " + n + " = " + Ex3_3_1.mod(m, n));
        m = 20;
        n = 40;
        assertEquals(Ex3_3_1.mod(m, n), (m%n));
        System.out.println(m + " % " + n + " = " + Ex3_3_1.mod(m, n));
        m = 0;
        n = 3;
        assertEquals(Ex3_3_1.mod(m, n), (m%n));
        System.out.println(m + " % " + n + " = " + Ex3_3_1.mod(m, n));
        m = 5;
        n = -4;
        assertEquals(Ex3_3_1.mod(m, n), (m%n));
        System.out.println(m + " % " + n + " = " + Ex3_3_1.mod(m, n));
        m = -5;
        n = 3;
        assertEquals(Ex3_3_1.mod(m, n), (m%n));
        System.out.println(m + " % " + n + " = " + Ex3_3_1.mod(m, n));
    }

    @Test
    void Ex3_2() // sorting by mod
    {
        System.out.println("Ex3_2 Test:");
        int n = 7;
        int [] arr1 = {3, 8, 9, 5}; // {3,8,9,5} % 7 ---> {3,1,2,5}  ---> {1,2,3,5} --->
        int [] res1 = {8, 9, 3, 5};
        assertArrayEquals(Ex3_3_1.sortModArray(arr1, n), res1);
        System.out.println(Arrays.toString(Ex3_3_1.sortModArray(arr1, n)) + " = " + Arrays.toString(res1));
        n = 5;
        int [] arr2 = {10, 44, 30, 21, 46}; // {0, 4, 0, 1, 1}
        int [] res2 = {10, 30, 21, 46, 44};
        assertArrayEquals(Ex3_3_1.sortModArray(arr2, n), res2);
        System.out.println(Arrays.toString(Ex3_3_1.sortModArray(arr2, n)) + " = " + Arrays.toString(res2));
        n = 9;
        int [] arr3 = {44, 10, 30, 21, 46}; // {9, 1, 3, 3, 1}
        int [] res3 = {10, 46, 21, 30, 44};
        assertArrayEquals(Ex3_3_1.sortModArray(arr3, n), res3);
        System.out.println(Arrays.toString(Ex3_3_1.sortModArray(arr3, n)) + " = " + Arrays.toString(res3));
        n = 3;
        int [] arr4 = {3,15,9,12,0,6}; // {0, 0, 0, 0, 0, 0} -> '%' equal but nums aren't
        int [] res4 = {0,3,6,9,12,15};
        assertArrayEquals(Ex3_3_1.sortModArray(arr4, n), res4);
        System.out.println(Arrays.toString(Ex3_3_1.sortModArray(arr4, n)) + " = " + Arrays.toString(res4));
        n = 6;
        int [] res5 = {0,6,12,3,9,15}; // {3,15,9,12,0,6} -> {0, 0, 0, 3, 3, 3}
        assertArrayEquals(Ex3_3_1.sortModArray(arr4, n), res5);
        System.out.println(Arrays.toString(Ex3_3_1.sortModArray(arr4, n)) + " = " + Arrays.toString(res5));
    }


    @Test
    void Ex3_3() // binary search by mod
    {
        System.out.println("Ex3_3 Test:");
        int [] a1 = {8,9,3,5};
        int n = 7;
        int num = 9;
        int res = 1;
        assertEquals(Ex3_3_1.searchModArray(a1, n, num), res);
        System.out.println(Arrays.toString(a1)+", n = "+n+", num = "+num+" -> "+ res+" (index)");
        n = 7;
        num = 2;
        res = -1;
        assertEquals(Ex3_3_1.searchModArray(a1, n, num), res);
        System.out.println(Arrays.toString(a1)+", n = "+n+", num = "+num+" -> "+ res+" (index)");
        int [] a2 = {1,4,7,9,12,16};
        n = 17;
        num = 16;
        res = 5;
        assertEquals(Ex3_3_1.searchModArray(a2, n, num), res);
        System.out.println(Arrays.toString(a2)+", n = "+n+", num = "+num+" -> "+ res+" (index)");
        int [] a3 = {0,3,6,9,12,15};
        n = 3;
        num = 0;
        res = 0;
        assertEquals(Ex3_3_1.searchModArray(a3, n, num), res); // same '%' value -> check the num
        System.out.println(Arrays.toString(a3)+", n = "+n+", num = "+num+" -> "+ res+" (index)");

    }

    @Test
    void Ex3_4() // Euler's function
    {
        System.out.println("Ex3_4 Test:");
        int n = 7;
        int res = 6; // {1,2,3,4,5,6} -> n-1
        assertEquals(Ex3_3_2.phi(n), res);
        System.out.println("Φ("+n+") = "+res);
        n = 6;
        res = 2; // {1, 5}
        assertEquals(Ex3_3_2.phi(n), res);
        System.out.println("Φ("+n+") = "+res);
        n = 20;
        res = 8; // {1,3,7,9,11,13,17,19}
        assertEquals(Ex3_3_2.phi(n), res);
        System.out.println("Φ("+n+") = "+res);
        n = 1;
        res = 1; // {1}
        assertEquals(Ex3_3_2.phi(n), res);
        System.out.println("Φ("+n+") = "+res);
        n = -5;
        res = -1; // illegal
        assertEquals(Ex3_3_2.phi(n), res);
        System.out.println("Φ("+n+") = "+res);
    }
}


/*
    private static int splitFormula2(String s, int n_barackets, int pos) {
        String legal_actions = "+-*%/";
            if (s.charAt(0) == '(') {
                n_barackets++;
                pos++;
                return splitFormula2(s.substring(1),n_barackets,pos);
            }
            if (s.charAt(0) == ')') {
                n_barackets--;
                pos++;
                return splitFormula2(s.substring(1),n_barackets,pos);
            }
            if (legal_actions.contains("" + s.charAt(0)) && n_barackets == 0) {
                pos++;
                return pos;
            }
        return 0;

    }

 */