public class CountNegative {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountNegative countNegative = new CountNegative();
        int[][] p = new int[2][2];
        p[0][0] = 3;
        p[0][1] = 2;
        p[1][0] = 1;
        p[1][1] = 0;
        System.out.println(countNegative.countNegatives(p));
    }
}
