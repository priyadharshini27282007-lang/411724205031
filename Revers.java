import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        int result = Revers(num);
        System.out.println("palindrom" + result);
    }
    static int Revers(int num) {
        int temp=num;
        int rev=0;
        while (num > 0) {
            rev = rev*10+num % 10;
            num = num / 10;
        }
        if(temp==num){
            System.out.println("this is a palindrom");
        }else{
            System.out.println("not a palindrom");
        }
        return rev;
    }
}