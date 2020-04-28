import java.util.ArrayList;
import java.util.List;

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
}
