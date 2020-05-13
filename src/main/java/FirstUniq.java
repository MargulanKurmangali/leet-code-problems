import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniq {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> res = new LinkedHashMap<>();
        HashMap<Character, Integer> index = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!res.containsKey(chars[i])) {
                res.put(chars[i], 1);
                index.put(chars[i], i);
            } else {
                res.put(chars[i], res.get(chars[i]) + 1);
            }
        }


        for (Map.Entry<Character, Integer> characterIntegerEntry : res.entrySet()) {
            if (characterIntegerEntry.getValue() == 1) {
                return index.get(characterIntegerEntry.getKey());
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniq firstUniq = new FirstUniq();
        System.out.println(firstUniq.firstUniqChar("dddccdbba"));
    }
}
