public class SplitBalancedString {
    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int c = 0;
        int r = 0;
        for (char anArr : arr) {
            if (anArr == 'L') {
                c++;
            } else if (anArr == 'R') {
                c--;
            }
            if (c == 0) {
                r++;
            }
        }

        return r;
    }
}
