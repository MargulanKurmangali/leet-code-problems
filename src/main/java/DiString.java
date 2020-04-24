public class DiString {
    public int[] diStringMatch(String S) {
        int i = 0;
        int d = S.length();
        int res[] = new int[d + 1];
        char s[] = S.toCharArray();
        for (int i1 = 0; i1 < s.length; i1++) {
            if (s[i1] == 'I') {
                res[i1] = i;
                i++;
            } else {
                res[i1] = d;
                d--;
            }

            if (i1 == s.length - 1) {
                if (s[i] == 'I') {
                    res[s.length] = i;
                } else {
                    res[s.length] = d;
                }
            }
        }

        return res;
    }
}
