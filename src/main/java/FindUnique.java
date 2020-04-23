public class FindUnique {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        int r = 1;

        if (n % 2 == 0) {
            for (int i = 0; i <n-1; i = i + 2) {
                res[i] = r;
                res[i + 1] = r * -1;
                r++;
            }
        } else {
            res[0] = 0;
            for (int i = 1; i < n-1; i = i + 2) {
                res[i] = r;
                res[i + 1] = r * -1;
                r++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindUnique findUnique = new FindUnique();
        System.out.println(findUnique.sumZero(1));
    }
}
