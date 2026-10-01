package Array;
import java.util.Scanner;

public class power_of_2{

    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }

        while(n%2==0){
            n=n/2;
        }

        return n==1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        boolean result=isPowerOfTwo(n);

        System.out.println("Is power of two: "+result);

        sc.close();
    }
}
