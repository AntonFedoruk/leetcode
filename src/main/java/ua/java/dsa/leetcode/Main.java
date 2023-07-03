package ua.java.dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        int[][] grid = {{3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}};


        System.out.println(equalPairs(grid));
        System.out.println(equalPairs2(grid));


    }

    public static int equalPairs(int[][] grid) {
        int pairCount = 0, row = 0;
        while (row <= grid.length - 1) {
//            HashMap<Integer, Integer> rowAsMap = new HashMap<>();
//            for (int j = 0; j < grid.length; j++) {
//                rowAsMap.put(j, grid[row][j]);
//            }
            int[] currentRow = grid[row];

            for (int c = 0; c < grid.length; c++) {
                int isPair = 0;
                for (int r = 1; r <= grid.length; r++) {
//                    if (rowAsMap.get(r) != grid[r][c]) {
                    if (currentRow[r-1] != grid[r-1][c]) {
                        isPair = 0;
                        break;
                    } else
                        isPair = 1;
                }
                pairCount += isPair;
            }
            row++;
        }
        return pairCount;
    }

    public static int equalPairs2(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < n; i++) {
            String row = Arrays.toString(grid[i]);
            map.put(row, 1 + map.getOrDefault(row, 0));
        }

        System.out.println(map);
        int tot = 0;

        for(int j = 0; j < n; j++) {
            int[] col = new int[n];
            for(int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            String colStr = Arrays.toString(col);
            tot += map.getOrDefault(colStr, 0);
        }
        return tot;
    }
}
