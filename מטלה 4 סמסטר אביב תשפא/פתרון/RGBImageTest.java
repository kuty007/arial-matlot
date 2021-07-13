import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RGBImageTest {
    int rt[][][]={{{4, 5, 9,1},{4, 5, 9,1},{4, 5, 9,1},{4, 5, 9,1}},{{4, 5, 9,1},{4, 5, 9,1},{4, 5, 9,1},{4, 5, 9,1}},{{4, 5, 9,1},{4, 5, 9,1},{4, 5, 9,1},{4, 5, 9,1}}};
    int[][][] arr2 = {
            {{4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6}},

            {{4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6}},


            {{4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6},
                    {4, 5, 9, 1, 3, 6}}};
    Frame color = new RGBImage(arr2);
    int[][][] arr3 = {
            {{4, 4, 4, 4},
                    {5, 5, 5, 5},
                    {9, 9, 9, 9},
                    {1, 1, 1, 1},
                    {3, 3, 3, 3},
                    {6, 6, 6, 6}
            },
            {{4, 4, 4, 4},
                    {5, 5, 5, 5},
                    {9, 9, 9, 9},
                    {1, 1, 1, 1},
                    {3, 3, 3, 3},
                    {6, 6, 6, 6}
            },
            {{4, 4, 4, 4},
                    {5, 5, 5, 5},
                    {9, 9, 9, 9},
                    {1, 1, 1, 1},
                    {3, 3, 3, 3},
                    {6, 6, 6, 6}}};
    int[][][] arr6 = {
            {{4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4}},

            {{4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4}},


            {{4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4},
                    {4, 6, 5, 4, 3, 4}}};
    int [][][] arr5 = {{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}}};
    int [][][] arr7 = {{{3,2,1},{3,2,1},{3,2,1}},{{3,2,1},{3,2,1},{3,2,1}},{{3,2,1},{3,2,1},{3,2,1}}};
    int [][][] arr8 = {{{4,4,4},{4,4,4},{4,4,4}},{{4,4,4},{4,4,4},{4,4,4}},{{4,4,4},{4,4,4},{4,4,4}}};
    Frame color1 = new RGBImage(arr5);
    Frame color2 = new RGBImage(arr7);
    @Test
    void rotate90() {
        color.rotate90();
        assertArrayEquals(arr3,((RGBImage)color).getFrame());

    }

    @Test
    void smooth() {
        color.smooth(3);
        assertArrayEquals(arr6,((RGBImage)color).getFrame());
    }

    @Test
    void getPixel() {
        int[]ar ={3,3,3};
        assertArrayEquals(ar, color.getPixel(3,4));
        int[]re={4, 4, 4};
        assertArrayEquals(re, color.getPixel(1,0));
    }

    @Test
    void crop() {
        color.crop(3,3);
        assertArrayEquals(rt,((RGBImage)color).getFrame());
    }

    @Test
    void addFrom() {
        color1.addFrom(color2);
        assertArrayEquals(arr8,((RGBImage)color1).getFrame());

    }

    @Test
    void compareTo() {
        assertEquals(0,((RGBImage)color1).compareTo(color2));
        assertEquals(1,((RGBImage)color).compareTo(color1));
        assertEquals(-1,((RGBImage)color1).compareTo(color));
    }

}