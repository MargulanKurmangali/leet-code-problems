import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SortArray {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i : A) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        int res[] = new int[A.length];
        int oddIndx = 0;
        int eveIndx = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = even.get(eveIndx++);
            } else {
                res[i] = odd.get(oddIndx++);
            }
        }
        return res;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int l = 0; l < mat[i].length; l++) {
                if (mat[i][l] == 1) {
                    count++;
                }
            }
            result.put(i, count);
        }

        result = result.entrySet().stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> next, Map.Entry<Integer, Integer> curr) {
                        if (next.getValue() == curr.getValue()) {
                            return 1;
                        }
                        if (next.getValue() > curr.getValue()) {
                            return 1;
                        }
                        return -1;
                    }
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        int[] r = new int[k];
        int i = 0;
        for (Integer integer : result.keySet()) {
            if (i == 3) break;
            r[i] = integer;
            i++;
        }
        return r;
    }

    public void sortMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 6);
        map.put("Z", 2);
        map.put("J", 3);
/*        map = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));*/

        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        sortArray.sortMap();
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};

        sortArray.kWeakestRows(mat, 3);
    }
}
