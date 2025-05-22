import java.util.*;
//Brute Force - O(n^2)   , TLE
// class BuySellStock1{
//   public static void main(String[] args){
//       int[] prices={7,1,5,3,6,4};
//       System.out.print("Maxium Profit can be: "+maxProfit(prices));
//   }
//   public static int maxProfit(int[] prices) {
//         int profit=0;
//         for(int i=0;i<prices.length;i++){
//             int x=0;
//             for(int j=i+1;j<prices.length;j++)
//             {
//                 x=Math.max(prices[j]-prices[i],x);
//             }
//             profit=Math.max(profit,x);
//         }

//         return profit;
//     }
// }

//Optimal -O(n)
class BuySellStock1{
  public static void main(String[] args){
      int[] prices={7,1,5,3,6,4};
      System.out.print("Maxium Profit can be: "+maxProfit(prices));
  }
  public static int maxProfit(int[] prices) {
         int profit=0,minPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){

            minPrice=Math.min(minPrice,prices[i]);

            profit=Math.max(profit,prices[i]-minPrice);
        }

        return profit;
    }
}
