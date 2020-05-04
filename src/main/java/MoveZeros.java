public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int indx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[indx] = nums[i];
                indx++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp[indx] = nums[i];
                indx++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] p = {0, 1, 0, 3, 12};
        moveZeros.moveZeroes(p);
    }
}
