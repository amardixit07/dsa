public class MazePaths {

    public static int countPaths(int[][] grid, int r, int c) {
        int n = grid.length;
        int m = grid[0].length;

        // Out of bounds or blocked
        if (r >= n || c >= m || grid[r][c] == 1) {
            return 0;
        }

        // Destination reached
        if (r == n - 1 && c == m - 1) {
            return 1;
        }

        // Move right + move down
        int right = countPaths(grid, r, c + 1);
        int down = countPaths(grid, r + 1, c);

        return right + down;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1},
                {0, 0, 0},
                {0, 1, 0}
        };

        System.out.println("Total Paths = " + countPaths(grid, 0, 0));
    }
}
