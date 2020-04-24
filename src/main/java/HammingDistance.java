public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String ax = String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
        String ay = String.format("%32s", Integer.toBinaryString(y)).replace(" ", "0");

        int diff = 0;
        for (int i = 0; i < ax.length(); i++) {
            if (ax.charAt(i) != ay.charAt(i)) {
                diff ++;
            }
        }

        return diff;
    }

    public int arrayPairSum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length/2; i++) {
           res += Math.min(nums[i], nums[i+2]);
        }

        return res;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        hammingDistance.hammingDistance(680142203,1111953568);
        int[] p = {1,4,3,2};
        hammingDistance.arrayPairSum(p);
    }
}
