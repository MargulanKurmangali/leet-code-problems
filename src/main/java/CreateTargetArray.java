import java.util.Arrays;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res[index[i]] == -1) {
                j = Math.max(j, index[i]);
                res[index[i]] = nums[i];
            } else {
                System.arraycopy(res, index[i], res, index[i] + 1, j - index[i] + 1);
                res[index[i]] = nums[i];
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        CreateTargetArray createTargetArray = new CreateTargetArray();
        createTargetArray.createTargetArray(nums, index);
    }
}
