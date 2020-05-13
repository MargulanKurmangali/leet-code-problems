import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RelativeSort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> notUnique = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            notUnique.add(arr2[i]);
        }
        List<Integer> unique = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!notUnique.contains(arr1[i])) {
                unique.add(arr1[i]);
            }
        }
        Collections.sort(unique);

        int[] res = new int[arr1.length];
        int indx = 0;
        for (int i = 0; i < notUnique.size(); i++) {
            int num = notUnique.get(i);
            for (int k = 0; k < arr1.length; k++) {
                if (num == arr1[k]) {
                    res[indx] = num;
                    indx ++;
                }
            }
        }
        for (int i = 0; i < unique.size(); i++) {
            res[indx] = unique.get(i);
            indx ++;
        }

        return res;
    }

    public static void main(String[] args) {
        int p1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int p2[] = {2,1,4,3,9,6};
        RelativeSort relativeSort = new RelativeSort();
        relativeSort.relativeSortArray(p1,p2);
    }
}
