public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        char[] jj = J.toCharArray();
        char[] ss = S.toCharArray();
        for (int i = 0; i < jj.length; i++) {
            char a = jj[i];
            for (int k = 0; k < ss.length; k++) {
                if (a == ss[k]) {
                    res++;
                }
            }
        }
        return res;
    }
}
