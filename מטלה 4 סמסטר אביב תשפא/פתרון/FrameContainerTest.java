import static org.junit.jupiter.api.Assertions.*;

/*
* */
class FrameContainerTest {
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
    Frame color = new RGBImage(arr2);
    Frame color2 = new RGBImage(arr3);
    int[][] arr4 = {{4, 4, 4, 4}, {5, 5, 5, 5}, {9, 9, 9, 9}, {1, 1, 1, 1}, {3, 3, 3, 3},
            {6, 6, 6, 6}};
    Frame gray3 = new GrayImage(arr4);


    int[][] arr = {{4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}};
    int[][] arr9 = {{4, 6, 5, 4, 3, 4}, {4, 6, 5, 4, 3, 4}, {4, 6, 5, 4, 3, 4}, {4, 6, 5, 4, 3, 4}};
    Frame gray = new GrayImage(arr);
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arr5 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
    Frame gray1 = new GrayImage(arr1);
    FrameContainer as = new FrameContainer();
    FrameContainer as2 = new FrameContainer();


    @org.junit.jupiter.api.Test
    void get() {
        as.add(gray);
        as.add(gray1);
        as.add(color);
        assertEquals(gray, as.get(0));
        assertEquals(color, as.get(2));
        assertEquals(gray1, as.get(1));

    }

    @org.junit.jupiter.api.Test
    void size() {
        as.add(gray);
        as.add(gray1);
        as.add(color);
        assertEquals(3, as.size());
    }

    @org.junit.jupiter.api.Test
    void add() {
        as2.add(gray);
        assertEquals(gray, as2.get(0));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        as.add(gray);
        as.add(gray1);
        as.add(color);
        as.remove(color);
        as2.add(gray);
        as2.add(gray1);
        for (int i = 0; i < as.size(); i++) {
            assertEquals(as.get(i), as2.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void sort() {
        as.add(gray);
        as.add(gray1);
        as.add(color);
        as.sort();
        as2.add(gray1);
        as2.add(gray);
        as2.add(color);
        for (int i = 0; i < as.size(); i++) {
            assertEquals(as.get(i),as2.get(i));


        }
    }

    @org.junit.jupiter.api.Test
    void rotateAll() {
        as.add(color);
        as.add(gray1);
        as.rotateAll();
        for (int i = 0; i < as.size(); i++) {
            if (as.get(i) instanceof RGBImage)
                assertArrayEquals(arr3, ((RGBImage) as.get(i)).getFrame());
            else assertArrayEquals(arr5, (((GrayImage) as.get(i)).getFrame()));
        }
    }


    @org.junit.jupiter.api.Test
    void smoothAll() {
        as.add(color);
        as.add(gray);
        as.smoothAll(3);
        for (int i = 0; i < as.size(); i++) {
            if (as.get(i) instanceof RGBImage)
                assertArrayEquals(arr6, ((RGBImage) as.get(i)).getFrame());
            else assertArrayEquals(arr9, (((GrayImage) as.get(i)).getFrame()));
        }
    }
}
