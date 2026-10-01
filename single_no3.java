package Array;
import java.util.Scanner;

public class single_no3 {

    public static int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int l=0;

        for(int i=0;i<nums.length;i++){
            int c=0;

            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }

            if(c==1){
                arr[l]=nums[i];
                l++;
            }
        }

        return arr;
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

        int result[]=singleNumber(nums);

        System.out.print("Single numbers: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}
