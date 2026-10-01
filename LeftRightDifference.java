package Array;
import java.util.Scanner;

public class LeftRightDifference {

    public static int[] leftRightDifference(int[] nums) {
        int [] a=new int [nums.length];

        for(int i=0;i<nums.length;i++){
            int l=0;
            int r=0;

            for(int j=0;j<i;j++){
                l=l+nums[j];
            }

            for(int j=i+1;j<nums.length;j++){
                r=r+nums[j];
            }

            int ab=Math.abs(l-r);
            a[i]=ab;
        }

        return a;
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

        int result[]=leftRightDifference(nums);

        System.out.print("Result: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}