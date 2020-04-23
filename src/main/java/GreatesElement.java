import javax.swing.*;
import java.util.Arrays;

public class GreatesElement {
    public static void main(String[] args) {
        GreatesElement greatesElement = new GreatesElement();
        int p[] = {17, 18, 5, 4, 6, 1};
        greatesElement.replaceElements(p);
    }

    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < arr.length; i++) {
            int max = -999;
            int maxIndx = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndx = j;
                }
            }

            for (int l = 0; l < maxIndx; l++) {
                if (res[l] == -1) {
                    res[l] = max;
                }
            }
        }

        return res;
    }

    public int[] replaceElementsSecondVariant(int[] arr) {
        if (arr == null) return arr;
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}
