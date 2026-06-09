import java.util.Arrays;

public class Array{
    public static void main(String args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(arr[0]);
        arr[1]=200;
        System.out.print(Arrays.toString(arr));
    }
}