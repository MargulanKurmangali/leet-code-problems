import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsAndCounts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsAndCounts.put(nums[i], numsAndCounts.getOrDefault(nums[i], 1) + 1);
        }
        double a = (double) nums.length / 2;

        for (Map.Entry<Integer, Integer> integerIntegerEntry : numsAndCounts.entrySet()) {
            if (integerIntegerEntry.getValue() > Math.ceil(a)) {
               return integerIntegerEntry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] p = {3,2,3};
        System.out.println(majorityElement.majorityElement(p));
    }
}
