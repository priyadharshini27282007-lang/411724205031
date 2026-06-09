public class Armstrong {
    public static void main(String[] args) {
        if (isArmstrong(2728)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
      static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return temp == sum;
    }
}