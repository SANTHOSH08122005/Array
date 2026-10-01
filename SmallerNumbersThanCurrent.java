package Array;
import java.util.Scanner;

public class  SmallerNumbersThanCurrent{

    public static int[] smallerNumberThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int c=0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    c++;
                    arr[i]=c;
                }
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

        int result[]=smallerNumberThanCurrent(nums);

        System.out.print("Result: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}
