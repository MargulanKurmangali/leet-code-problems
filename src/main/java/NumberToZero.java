public class NumberToZero {
    public int count = 0;

    public int numberOfSteps(int num) {

        if (num > 0 && num % 2 == 0) {
            count++;
            numberOfSteps(num / 2);
        } else if (num > 0 && num % 2 != 0) {
            count++;
            numberOfSteps(num - 1);
        }

        return count;
    }

    public static void main(String[] args) {
        NumberToZero numberToZero = new NumberToZero();
        System.out.println(numberToZero.numberOfSteps(123));
    }
}
