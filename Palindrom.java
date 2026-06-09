public class Palindrom {
    public static void main(String[] args) {
        if (isPalindrome(121)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return temp == rev;
    }
}