
import java.awt.*;


public class GameOfLife {
    public static void main(String[] args) {
        gameOfLife(100, 3);
    }


    public static void gameOfLife(int n, int cellSize) {
        if (cellSize % 2 != 0)
            cellSize += 1;
        boolean mat[][] = random_mat(n);
        while (true) {
            StdDraw.setPenColor(Color.lightGray);
            StdDraw.setPenRadius(0.002);
            StdDraw.setXscale(0, n * cellSize);
            StdDraw.setYscale(n * cellSize, 0);
            int x;
            for (x = 0; x <= n * cellSize; x += cellSize) {
                StdDraw.line(x, 0, x, n * cellSize);
                StdDraw.line(0, x, n * cellSize, x);
            }
            drawCells(mat, cellSize, Color.YELLOW);
            StdDraw.setPenColor(Color.lightGray);
            for (x = 0; x <= n * cellSize; x += cellSize) {
                StdDraw.line(x, 0, x, n * cellSize);
                StdDraw.line(0, x, n * cellSize, x);
            }
            StdDraw.pause(555);
            StdDraw.clear();
            mat = NextGeneration.nextGeneration(mat);
        }
    }


    public static void clearCells(boolean[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = false;

            }

        }
    }

    public static void clearCells1(boolean[][] cells) {
        StdDraw.clear();
    }


    public static void drawCells(boolean[][] cells, int cellSize, Color color) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if (NextGeneration.isInsideAndLive(cells, i, j)) {
                    double p = j * cellSize + cellSize / 2;
                    double q = i * cellSize + cellSize / 2;
                    StdDraw.setPenColor(color);
                    StdDraw.filledSquare(p, q, cellSize / 2);


                }

            }

        }

    }

    public static boolean[][] random_mat(int n) {
        boolean mat[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = Math.random() > 0.5;
            }
        }
        return mat;

    }
}


