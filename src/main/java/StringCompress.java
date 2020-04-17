import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;


public class StringCompress {
    public static void main(String[] args) {
        System.out.println("");
    }
    public int compress(char[] chars) {
        int count = 1;
        HashMap<Character, Integer> res = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (!res.containsKey(chars[i])) {
                count = 1;
                res.put(chars[i],count);
            } else {
                count ++;
                res.put(chars[i], count);
            }
        }

        int l = 0;
        for (Character character : res.keySet()) {
            int s = res.get(character);
            chars[l] = character;
            l++;
            char[] ss = Character.toChars(s);
            if (ss.length > 1) {
                for (int i = 0; i < ss.length; i++) {
                    chars[l] = ss[i];
                    l++;
                }
            }
        }

        return chars.length;
    }
}
