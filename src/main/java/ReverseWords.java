import java.util.Arrays;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] splitted = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < splitted.length; i++) {
            char[] chars = splitted[i].toCharArray();
            for (int k = chars.length - 1; k >= 0; k--) {
                res.append(chars[k]);
            }
            if (i < splitted.length - 1) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}
