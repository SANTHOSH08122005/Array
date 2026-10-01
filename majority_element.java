package Array;
import java.util.Scanner;
import java.util.Arrays;

public class majority_element
{

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length/2];
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

        int result=majorityElement(nums);

        System.out.println("Majority element: "+result);

        sc.close();
    }
}