public class RobotReturn {
    public boolean judgeCircle(String moves) {
        int hor = 0;
        int ver = 0;
        char[] directions = moves.toCharArray();

        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == 'U') {
                ver++;
            } else if (directions[i] == 'D'){
                ver--;
            } else if (directions[i] == 'L'){
                hor++;
            } else if (directions[i] == 'R'){
                hor--;
            }
        }

        return ver==0 && hor == 0;
    }

    public int[] sortedSquares(int[] A) {
        if(A == null || A.length < 1) return A;

        int [] res = new int[A.length];
        int left = 0, right = A.length - 1;
        int index = A.length - 1;
        while(index >= 0){
            if(A[left] * A[left] < A[right] * A[right])
                res[index--] =  A[right] * A[right--];
            else
                res[index--] =  A[left] * A[left++];
        }
        return res;
    }

    public static void main(String[] args) {
        RobotReturn robotReturn = new RobotReturn();
        System.out.println(robotReturn.judgeCircle("LDRRLRUULR"));
        int []p = {-7,-2,-1,0,6,11};
        robotReturn.sortedSquares(p);
    }
}
