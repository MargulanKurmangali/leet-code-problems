public class Distance {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) > d) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == arr2.length) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        int a[] = {4, 5, 8};
        int b[] = {10, 9, 1, 8};
        distance.findTheDistanceValue(a, b, 2);
    }
}
