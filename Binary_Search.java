package Array;
import java.util.Scanner;

public class Binary_Search{

    public static int search(int[] nums,int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r) {
            int m=l+(r-l)/2;

            if(nums[m]==target) {
                return m;
            }
            else if(nums[m]<target) {
                l=m+1;
            }
            else {
                r=m-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n=sc.nextInt();

        int[] nums=new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target=sc.nextInt();

        int result=search(nums,target);

        System.out.println("Index: "+result);

        sc.close();
    }
}
