package ua.java.dsa.leetcode;

import java.util.Arrays;

public class IncreasingPathInAGrid {
    static int[][] input1 = {{1, 1}, {3, 4}};
    static int mod = (int) (1e9 + 7);

    public static void main(String[] args) {
        System.out.println(countPath(input1));
    }

    public static int countPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        int path = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                path = (path + solve(grid, i, j, -1, dp)) % mod;
            }
        }
        return path;
    }

    private static int solve(int[][] grid, int i, int j, int prev, int[][] dp) {
        //OutBoundException + 'IncreasingPath goal' catching
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] <= prev) {
            return 0;
        }

        int gridVal = grid[i][j];

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int left = solve(grid, i, j - 1, gridVal, dp);
        int right = solve(grid, i, j + 1, gridVal, dp);
        int up = solve(grid, i + 1, j, gridVal, dp);
        int down = solve(grid, i - 1, j, gridVal, dp);

        return dp[i][j] = (1 + left + right + up + down) % mod;
    }
}