import java.util.ArrayList;
import java.util.List;

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length/2; j++) {
                int temp = A[i][A[i].length - j - 1];
                A[i][A[i].length - j -1] = A[i][j];
                A[i][j] = temp;
            }

            for (int k = 0; k < A[i].length; k++) {
                if (A[i][k] == 1) {
                    A[i][k] = 0;
                } else {
                    A[i][k] = 1;
                }
            }
        }
        return A;
    }
    int counter = 0;
    List<Integer> res = new ArrayList<>();

    public List<Integer> selfDividingNumbers(int left, int right) {
        for (int i = left; i <= right; i++) {
            char[] chars = ("" + i).toCharArray();
                getNumber(i,i);
                if (counter == chars.length) {
                    res.add(i);
                }
                counter = 0;
        }
        return res;
    }

    public void getNumber(int a, int i) {
        if (a == 0) {
            return;
        }
        int c = a%10;
        if (c != 0 && i % c == 0) {
            counter++;
        }

        getNumber(a/10, i );
    }


    public static void main(String[] args) {
        FlippingImage flippingImage = new FlippingImage();
        flippingImage.selfDividingNumbers(1, 22);
    }
}
