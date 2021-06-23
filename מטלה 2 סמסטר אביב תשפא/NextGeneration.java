import java.util.Arrays;

public class NextGeneration {
    public static void main(String[] args) {
        boolean[][] test = {{false, false, false}, {true, true, true,}, {false, false, false}};
        System.out.println(Arrays.deepToString(nextGeneration(test)));

    }

    public static boolean isInsideAndLive(boolean[][] cells, int x, int y) {
        if (x < 0 || cells.length <= x) {
            return false;
        }
        if (y < 0 || cells[0].length <= y) {
            return false;
        }
        return cells[x][y];


    }

    public static int numberOfNeighbors(boolean[][] cells, int x, int y) {
        int count = 0;

        if (isInsideAndLive(cells, x - 1, y - 1))
            count++;
        if (isInsideAndLive(cells, x, y - 1))
            count++;
        if (isInsideAndLive(cells, x + 1, y - 1))
            count++;
        if (isInsideAndLive(cells, x - 1, y))
            count++;
        if (isInsideAndLive(cells, x + 1, y))
            count++;
        if (isInsideAndLive(cells, x - 1, y + 1))
            count++;
        if (isInsideAndLive(cells, x, y + 1))
            count++;
        if (isInsideAndLive(cells, x + 1, y + 1))
            count++;
        return count;
    }

    public static boolean[][] nextGeneration(boolean[][] cells) {
        boolean[][] new_board = new boolean[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                int aliveNigb = numberOfNeighbors(cells, i, j);

                if (cells[i][j]) {
                    new_board[i][j] = aliveNigb >= 2 && aliveNigb <= 3;
                } else {
                    if (aliveNigb == 3) {
                        new_board[i][j] = true;
                    }
                }
                if (aliveNigb > 3) {
                    new_board[i][j] = false;
                }

            }

        }

        return new_board;
    }

}

