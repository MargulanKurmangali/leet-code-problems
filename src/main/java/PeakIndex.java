public class PeakIndex {
    public int peakIndexInMountainArray(int[] A) {
        int max = -9999999;
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i] && i >0 && i< A.length -1 ) {
                max = A[i];
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        PeakIndex peakIndex = new PeakIndex();
        int[] p = {0,2,1,0};
        peakIndex.peakIndexInMountainArray(p);
    }
}
