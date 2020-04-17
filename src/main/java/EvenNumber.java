public class EvenNumber {
    int countEven;
    int count;

    public int findNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            int c = evenCount(nums[i]);
            if (c % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public int evenCount(int n) {
        if (n != 0) {
            count++;
            evenCount(n / 10);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        EvenNumber evenNumber = new EvenNumber();
        System.out.println(evenNumber.findNumbers(nums));
    }


}
