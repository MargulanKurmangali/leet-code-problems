import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> nonDuplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!nonDuplicates.contains(nums[i])) {
                nonDuplicates.add(nums[i]);
            } else {
                nonDuplicates.remove((Integer) nums[i]);
            }
        }

        return nonDuplicates.get(0);
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int p[] = {1, 1, 1, 2};
        System.out.println(singleNumber.singleNumber(p));
    }
}
