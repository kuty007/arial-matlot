import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrameContainer implements ContainerFunctions {
    public static void main(String[] args) {
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

        int[][] arr = {{4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}};
        Frame gray = new GrayImage(arr);
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Frame gray1 = new GrayImage(arr1);
        FrameContainer as = new FrameContainer();
        FrameContainer as2 = new FrameContainer();
        as.add(gray);
        as.add(gray1);
        as.add(color);
        as.sort();
    }

    private Frame[] array;
    // holds the current size of array
    private int size;
    // holds the total capacity of array
    private int capacity;

    public FrameContainer() {
        array = new Frame[2];
        size = 0;
        capacity = 2;
    }

    public FrameContainer(String file) {
        array = new Frame[5];
        capacity = 5;
        try {
            File f = new File(file);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                if (data[1] == "1") {
                    Frame temp = MyImageIO.readImageFromFile(data[0], false);
                    add(temp);
                } else if (data[1] == "0") {
                    Frame temp = MyImageIO.readImageFromFile(data[0], true);
                    add(temp);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Frame get(int i) {
        return array[i];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Frame f) {
        if (size == capacity) {
            ensureCapacity(2);
        }
        array[size] = f;
        size++;
    }

    @Override
    public void remove(Frame f) {
        for (int i = 0; i < size; i++) {
            if (array[i] == f) {
                int x = i;
                for (int j = x; j < size - 1; j++) {
                    array[x] = array[x + 1];
                }
                array[size - 1] = null;
                size--;
            }
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j].frameSize() > array[j + 1].frameSize()) {
                    Frame temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    @Override
    public void rotateAll() {
        for (int i = 0; i < size; i++) {
            array[i].rotate90();
        }
    }

    @Override
    public void smoothAll(int n) {
        for (int i = 0; i < size; i++) {
            array[i].smooth(n);
        }
    }

    public void ensureCapacity(int minCapacity) {
        Frame[] temp = new Frame[capacity * minCapacity];
        for (int i = 0; i < capacity; i++) {
            temp[i] = array[i];
        }
        array = temp;
        capacity = capacity * minCapacity;
    }

    public void addElement(int index, Frame element) {
        // double the capacity if all the allocated space is utilized
        if (size == capacity) {
            ensureCapacity(2);
        }
        // shift all elements from the given index to right
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        // insert the element at the specified index
        array[index] = element;
        size++;
    }

}



