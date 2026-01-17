class RatMaze {
    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol, int n) {
        if (x == n - 1 && y == n - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1) {
            sol[x][y] = 1;

            if (solveMaze(maze, x + 1, y, sol, n)) return true;
            if (solveMaze(maze, x, y + 1, sol, n)) return true;

            sol[x][y] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = 4;
        int[][] sol = new int[n][n];
        solveMaze(maze, 0, 0, sol, n);

        for (int[] row : sol) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
