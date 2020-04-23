import java.util.List;
import java.util.Optional;

public class Triangle {
    public static void main(String[] args) {
/*
        Triangle triangle = new Triangle();
        List<List<Integer>> param = new ArrayList<>();
        param.add(Arrays.asList(-1));
        param.add(Arrays.asList(2,3));

        param.add(Arrays.asList(1,-1,-3));


        System.out.println(triangle.minimumTotal(param));
*/

    }
    int tempIndex = 0;

    public int minimumTotal(List<List<Integer>> triangle) {
        int res = 0;
        for (int i = 0; i < triangle.size(); i++) {
            int min = getMin(triangle.get(i));
            res = res + min;
        }

        return res;
    }

    private int getMin(List<Integer> integers) {
        int min =9999999;
        int indx = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (i - tempIndex <= 1) {
                if (min > integers.get(i)) {
                    min =  integers.get(i);
                    indx = i;
                }
            }
        }
        tempIndex = indx;
        return min;
    }
}
