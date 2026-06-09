public class Prime {
    public static void main(String[] args) 
        if (Isprime(45)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        Isprime(34)
    }
    public static boolean Isprime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
}