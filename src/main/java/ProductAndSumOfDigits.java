public class ProductAndSumOfDigits {
    public int sum = 0;
    public int prod = 1;

    public int subtractProductAndSum(int n) {
        if (n != 0) {
            operate(n%10);
            subtractProductAndSum(n/10);
        }
        return prod - sum;
    }

    public void operate(int a) {
        sum = sum + a;
        prod = prod * a;
    }

    public static void main(String[] args) {
        ProductAndSumOfDigits productAndSumOfDigits = new ProductAndSumOfDigits();
        System.out.println(productAndSumOfDigits.subtractProductAndSum(243));
    }


}
