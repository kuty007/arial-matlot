import java.util.Arrays;

public class GrayImage implements Frame, Comparable<Frame> {
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}, {4, 5, 9, 1, 3, 6}};
        Frame gray = new GrayImage(arr);
        gray.smooth(3);
        //System.out.println(Arrays.deepToString(((GrayImage) gray).getFrame()));
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr5 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        Frame gray1 = new GrayImage(arr1);
        gray1.crop(3, 1);
        System.out.println(Arrays.deepToString(((GrayImage) gray1).getFrame()));

    }

    private int[][] frame;

    public GrayImage(int[][] img) {
        setFrame(img);
    }

    public GrayImage(GrayImage other) {
        int x, y;
        x = other.getFrame().length;
        y = other.getFrame()[0].length;
        this.frame = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.frame[i][j] = other.getFrame()[i][j];

            }
        }
    }

    public void setFrame(int[][] frame) {
        this.frame = frame;
    }


    public int[][] getFrame() {
        return frame;
    }

    @Override
    public void rotate90() {
        int[][] res = new int[this.frame[0].length][this.frame.length];

        //Transpose
        for (int i = 0; i < this.frame[0].length; i++) {
            for (int j = 0; j < this.frame.length; j++) {
                res[i][j] = this.frame[this.frame.length - 1 - j][i];
            }
        }
        //copying res to the matrix array
        frame = res;
    }


    @Override
    public void smooth(int n) {
        int[][] temp_frame = new int[this.frame.length][this.frame[0].length];
        for (int i = 0; i < this.frame.length; i++) {
            for (int j = 0; j < this.frame[0].length; j++) {
                int x = i - n / 2;
                int y = j - n / 2;
                int z = i + n / 2;
                int r = j + n / 2;
                int temp = 0;
                int sum = 0;
                for (int k = x; k <= z; k++) {
                    for (int l = y; l <= r; l++) {
                        if (isInside(frame, k, l)) {
                            sum += frame[k][l];
                            temp++;
                        }
                    }
                }
                int value = ((sum) / (temp));
                temp_frame[i][j] = value;
            }
        }
        this.frame = temp_frame;

    }

    @Override
    public int[] getPixel(int x, int y) {
        int j = this.frame[x][y];
        int[] position = new int[1];
        position[0] = j;
        return position;
    }

    @Override
    public void crop(int x, int y) {
        int array[][] = new int[x+1][y+1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                array[i][j] = this.frame[i][j];
            }
        }
        this.frame = array;


    }

    @Override
    public void addFrom(Frame f) {
        int x1 = this.frame.length;
        int y1 = this.frame[0].length;
        int x2 = ((GrayImage) f).getFrame().length;
        int y2 = ((GrayImage) f).getFrame()[0].length;
        if (x1 == x2 && y1 == y2) {
            for (int i = 0; i < this.frame.length; i++) {
                for (int j = 0; j < this.frame[0].length; j++) {
                    this.frame[i][j] += ((GrayImage) f).getFrame()[i][j];
                    if ( this.frame[i][j]>255*255){
                        this.frame[i][j]=255*255;
                    }
                }
            }
        }
    }

    @Override
    public int compareTo(Frame o) {
        int x1, y1, x2, y2;
        x1 = this.frame.length;
        y1 = this.frame[0].length;
        x2 = ((GrayImage) o).getFrame().length;
        y2 = ((GrayImage) o).getFrame()[0].length;
        int frame1 = x1 * y1;
        int frame2 = x2 * y2;
        if (frame1 == frame2) {
            return 0;
        } else if (frame1 < frame2) {
            return -1;
        }
        return 1;

    }

    public static boolean isInside(int[][] cells, int x, int y) {
        if (x < 0 || cells.length <= x) {
            return false;
        }
        if (y < 0 || cells[0].length <= y) {
            return false;
        }
        return true;
    }

    public int frameSize() {
        int x, y;
        x = this.frame.length;
        y = this.frame[0].length;
        return x * y;
    }
}
