import java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num:");
        int num = sc.nextInt();
        int count=0;
        int digit;
        while(num>0){
            digit=num %10;
            if(digit%2==0)
                count++;
            num=num/10;
        }
        System.out.println("the  num of even is"+ count);
    }
}