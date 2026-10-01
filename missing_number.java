package Array;
import java.util.Scanner;

import java.util.Scanner;

public class missing_number {

    public static int missingNumber(int[] nums) {
        int n=nums.length;

        int a=n*(n+1)/2;

        int c=0;

        for(int i=0;i<nums.length;i++){
            c=c+nums[i];
        }

        return a-c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n=sc.nextInt();

        int nums[]=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int result=missingNumber(nums);

        System.out.println("Missing number: "+result);

        sc.close();
    }
}