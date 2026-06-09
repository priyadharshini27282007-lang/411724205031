import java.util.Scanner;

public class Countd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        int result = countEvenDigits(num);
        System.out.println("The number of even digits is " + result);
    }
    static int countEvenDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                count++;
            num = num / 10;
        }
        return count;
    }
}