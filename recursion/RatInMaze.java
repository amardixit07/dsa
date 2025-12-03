import java.util.*;

public class RatInMaze {
    static void solve(int[][] maze, int row, int col, int n, boolean[][] vis, String path, List<String> result) {
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }

        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || vis[row][col]) return;

        vis[row][col] = true;

        solve(maze, row + 1, col, n, vis, path + "D", result);
        solve(maze, row, col - 1, n, vis, path + "L", result);
        solve(maze, row, col + 1, n, vis, path + "R", result);
        solve(maze, row - 1, col, n, vis, path + "U", result);

        vis[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;
        boolean[][] vis = new boolean[n][n];
        List<String> result = new ArrayList<>();

        solve(maze, 0, 0, n, vis, "", result);

        System.out.println(result);
    }
}
