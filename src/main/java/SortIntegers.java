import java.util.Arrays;
import java.util.Comparator;

public class SortIntegers {
    public int[] sortByBits(int[] arr) {
        Integer[] z = new Integer[arr.length];
        for (int i = 0; i < z.length; i++) {
            z[i] = arr[i];
        }
        Arrays.sort(z, (Comparator) (f, s) -> {
            int a = (int) f;
            int b = (int) s;
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            if (bitA == bitB) {
                return a - b;
            } else {
                return bitA - bitB;
            }
        });

        for (int i = 0; i < z.length; i++) {
            arr[i] = z[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        SortIntegers sortIntegers = new SortIntegers();
        int[] p = {7, 6, 5, 4, 3, 2, 1};
        sortIntegers.sortByBits(p);
    }
}
