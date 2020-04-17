public class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            res[i] = count;
        }

        return nums;
    }

    public static void main(String[] args) {
        SmallerThanCurrent smallerThanCurrent = new SmallerThanCurrent();
        int[] a = {8,1,2,2,3};
        int[] res = smallerThanCurrent.smallerNumbersThanCurrentFastes(a);
        System.out.println(res);
    }
    public int[] smallerNumbersThanCurrentFastes(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        int indx = 0;
        int current = 0;
        int i = 0;
        while (indx < nums.length) {
            current = nums[indx];
            if (i < nums.length) {
                if (nums[i] < current) {
                  count++;
                  i++;
                } else {
                    i++;
                }
            } else {
                res[indx] = count;
                count = 0;
                indx ++;
                i = 0;
            }
        }
        return res;
    }
}
