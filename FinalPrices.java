package Array;
import java.util.Scanner;

public class FinalPrices {

    public static int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }

        return prices;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n=sc.nextInt();

        int prices[]=new int[n];

        System.out.println("Enter prices:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        int result[]=finalPrices(prices);

        System.out.print("Final prices: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}
