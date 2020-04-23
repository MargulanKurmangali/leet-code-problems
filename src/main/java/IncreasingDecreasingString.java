import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        System.out.println(increasingDecreasingString.sortString("leetcode"));
    }

    public String sortString(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char chars[] = s.toCharArray();
        StringBuilder res = new StringBuilder();
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                int a = hashMap.get(chars[i]);
                hashMap.put(chars[i], ++a);
            } else {
                hashMap.put(chars[i], 1);
                letters.add(chars[i]);
            }
        }

        Collections.sort(letters);

        boolean reverse = false;
        int end = 0;
        while (hashMap.size() > 0) {
            end ++;
            if (!reverse) {
                for (int i = 0; i < letters.size(); i++) {
                    if (!hashMap.containsKey(letters.get(i))) {
                        continue;
                    }
                    int a = hashMap.get(letters.get(i));
                    if (a > 0) {
                        res.append(letters.get(i));
                        hashMap.put(letters.get(i), --a);
                    }
                    if (a == 0) {
                        hashMap.remove(letters.get(i));
                    }
                }
                reverse = true;
            } else {
                for (int i = letters.size() - 1; i >= 0; i--) {
                    if (!hashMap.containsKey(letters.get(i))) {
                        continue;
                    }
                    int a = hashMap.get(letters.get(i));
                    if (a > 0) {
                        res.append(letters.get(i));
                        hashMap.put(letters.get(i), --a);
                    }
                    if (a == 0) {
                        hashMap.remove(letters.get(i));
                    }
                }

                reverse = false;
            }
        }
        return res.toString();
    }
}
