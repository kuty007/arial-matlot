import java.util.Arrays;

public class RGBImage implements Frame, Comparable<Frame> {
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
        color.crop(3,3);

        System.out.println(Arrays.deepToString(((RGBImage) color).getFrame()));
    }


    int frame[][][];

    public RGBImage(int[][][] img) {
        setFrame(img);
    }

    public RGBImage(RGBImage other) {
        int x = other.getFrame()[0].length;
        int y = other.getFrame()[0][0].length;
        this.frame = new int[3][x][y];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < y; k++) {
                    this.frame[i][j][k] = other.getFrame()[i][j][k];

                }

            }

        }

    }

    public void setFrame(int[][][] frame) {
        this.frame = frame;
    }

    public int[][][] getFrame() {
        return frame;
    }

    @Override
    public void rotate90() {
        int[][][] res = new int[3][this.frame[0][0].length][this.frame[0].length];
        //Transpose
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < this.frame[0][0].length; j++) {
                for (int k = 0; k < this.frame[0].length; k++) {
                    res[i][j][k] = this.frame[i][this.frame[0].length - 1 - k][j];
                }
            }
        }
        frame = res;
    }

    @Override
    public void smooth(int n) {
        if (n % 2 == 0) {
            n -= 1;
        }
        int[][][] res = new int[3][this.frame[0].length][this.frame[0][0].length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < this.frame[0].length; j++) {
                for (int k = 0; k < this.frame[0][0].length; k++) {
                    int x = j - n / 2;
                    int y = k - n / 2;
                    int z = j + n / 2;
                    int r = k + n / 2;
                    int temp = 0;
                    int sum = 0;
                    for (int u = x; u <= z; u++) {
                        for (int l = y; l <= r; l++) {
                            if (isInside1(frame, u, l)) {
                                sum += frame[i][u][l];
                                temp++;
                            }
                        }
                    }
                    int value = ((sum) / (temp));
                    res[i][j][k] = value;
                }
            }
        }
        this.frame = res;

    }

    @Override
    public int[] getPixel(int x, int y) {
        int[] j = new int[3];
        j[0] = this.frame[0][x][y];
        j[1] = this.frame[1][x][y];
        j[2] = this.frame[2][x][y];
        return j;
    }

    @Override
    public void crop(int x, int y) {
        int array[][][] = new int[3][x+1][y+1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <=x; j++) {
                for (int k = 0; k <= y; k++) {
                    array[i][j][k] = this.frame[i][j][k];

                }

            }
        }
        this.frame = array;

    }

    @Override
    public void addFrom(Frame f) {
        int x1, y1, x2, y2;
        x1 = this.frame[0].length;
        y1 = this.frame[0][0].length;
        x2 = ((RGBImage) f).getFrame()[0].length;
        y2 = ((RGBImage) f).getFrame()[0][0].length;
        if (x1 == x2 && y1 == y2) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < this.frame[0].length; j++) {
                    for (int k = 0; k < this.frame[0][0].length; k++) {
                        this.frame[i][j][k] += ((RGBImage) f).getFrame()[i][j][k];
                        if (this.frame[i][j][k] > 255) {
                            this.frame[i][j][k] = 255;
                        }

                    }
                }
            }
        }

    }


    @Override
    public int compareTo(Frame o) {
        int x1, y1, x2, y2;
        x1 = this.frame[0].length;
        y1 = this.frame[0][0].length;
        x2 = ((RGBImage) o).getFrame()[0].length;
        y2 = ((RGBImage) o).getFrame()[0][0].length;
        int frame1 = x1 * y1;
        int frame2 = x2 * y2;
        if (frame1 == frame2) {
            return 0;
        } else if (frame1 < frame2) {
            return -1;
        }
        return 1;
    }

    public static boolean isInside1(int[][][] cells, int x, int y) {
        if (x < 0 || cells[0].length <= x) {
            return false;
        }
        if (y < 0 || cells[0][0].length <= y) {
            return false;
        }
        return true;
    }

    public int frameSize() {
        int x, y;
        x = this.frame[0].length;
        y = this.frame[0][0].length;
        return x * y;
    }
}






