import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrayImageTest {
    int[][] arr = {{4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}};
    int[][] arr9 = {{4, 6, 5, 4, 3, 4}, {4, 6, 5, 4, 3, 4}, {4, 6, 5, 4, 3, 4}, {4, 6, 5, 4, 3, 4}};
    Frame gray = new GrayImage(arr);
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arr10 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    int[][] arr11 = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
    Frame gray2 = new GrayImage(arr10);
    int[][] arr5 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
    int[][] arr6 = {{1}, {4}, {7}};
    Frame gray1 = new GrayImage(arr1);


    @Test
    void rotate90() {
        gray1.rotate90();
        assertArrayEquals(arr5, ((GrayImage) gray1).getFrame());

    }

    @Test
    void smooth() {
        gray.smooth(3);
        assertArrayEquals(arr9, ((GrayImage) gray).getFrame());
    }

    @Test
    void getPixel() {
        int[] ar = {5};
        assertArrayEquals(ar, gray1.getPixel(1, 1));
        int[] art = {9};
        assertArrayEquals(art, gray1.getPixel(2, 2));


    }

    @Test
    void crop() {
        gray1.crop(2, 0);
        assertArrayEquals(arr6, ((GrayImage) gray1).getFrame());
    }

    @Test
    void addFrom() {
        gray1.addFrom(gray2);
        assertArrayEquals(arr11, ((GrayImage) gray1).getFrame());

    }

    @Test
    void compareTo() {
        assertEquals(0, ((GrayImage) gray1).compareTo(gray2));
        assertEquals(1, ((GrayImage) gray).compareTo(gray2));
        assertEquals(-1, ((GrayImage) gray1).compareTo(gray));
    }
}