import java.util.ArrayList;
import java.util.List;

public class RepeatedElement {
    public int repeatedNTimes(int[] A) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (!elements.contains(A[i])) {
                elements.add(A[i]);
            } else {
                return A[i];
            }
        }
        return 0;
    }
}
