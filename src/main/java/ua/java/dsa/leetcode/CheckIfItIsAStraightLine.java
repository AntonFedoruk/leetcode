package ua.java.dsa.leetcode;

public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        int[][] inputT = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int[][] inputF = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        System.out.println(checkStraightLine(inputT));
        System.out.println(checkStraightLine(inputF));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
//            S = 1/2 ((х1-х3) (у2-у3) — (х2-х3) (у1-у3))
            double s = 0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
            if (s != 0) return false;
        }
        return true;
    }
}