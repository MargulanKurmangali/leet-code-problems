public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        int left = 0, right = 0;
        int lPos = 0;
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                if (lPos == 0 && left == 0) {
                    lPos = i;
                }
                left++;
                continue;
            }
            if (chars[i] == ')') {
                right++;
            }
            if (chars[i] == ')' && left == right) {
                chars[lPos] = '%';
                chars[i] = '%';
                left = 0;
                right = 0;
                lPos = 0;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '%') {
                res.append(chars[i]);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses parentheses = new RemoveOutermostParentheses();
        System.out.println(parentheses.removeOuterParentheses("(()())()"));
    }
}
