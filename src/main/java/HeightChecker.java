import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] prototype = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < prototype.length; i++) {
            if (prototype[i] != heights[i]) {
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        int param[] = {1,1,4,2,1,3};
        heightChecker.heightChecker(param);
    }

}
