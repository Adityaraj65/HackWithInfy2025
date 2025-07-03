import java.util.Arrays;
import java.util.Scanner;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter money");
        int money = sc.nextInt();
        System.out.println("enter length of prices array");
        int n=sc.nextInt();
        int [] prices=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter prices for index"+i);
            prices[i]=sc.nextInt();
        }
       int finalmoney= buyChoco(prices, money);
       System.out.println(finalmoney);
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);  // Sort the prices
        int total = prices[0] + prices[1];  // Cheapest two

        if (total < money) {
            return money - total;
        } else {
            return money;
        }
    }
}
