import java.util.*;
import java.util.stream.Collectors;

public class FindLucky {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> numsAndOccurances = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!numsAndOccurances.containsKey(arr[i])) {
                numsAndOccurances.put(arr[i], 1);
            } else {
                numsAndOccurances.put(arr[i], numsAndOccurances.get(arr[i])+1);
            }
        }

        numsAndOccurances = numsAndOccurances.entrySet().stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> next, Map.Entry<Integer, Integer> curr) {
                        if (next.getValue() > curr.getValue()) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        for (Map.Entry<Integer, Integer> integerIntegerEntry : numsAndOccurances.entrySet()) {
            if (integerIntegerEntry.getKey() == integerIntegerEntry.getValue()) {
                return integerIntegerEntry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindLucky findLucky = new FindLucky();
        int p[] = {1,2,2,3,3,3};
        System.out.println(findLucky.findLucky(p));
    }
}
