public class EncodedList {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            size = size + nums[i];
        }
        int[] res = new int[size];
        int indx = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            for (int j = 0; j < nums[i] ; j++) {
              res[indx] = nums[i+1];
              indx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        EncodedList encodedList = new EncodedList();
        int[] param = {3,3,4,5};
        int[] res = encodedList.decompressRLElist(param);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
