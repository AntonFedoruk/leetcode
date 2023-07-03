package ua.java.dsa.leetcode;

public class BesTime2BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4}; //5
        int[] prices2 = {7, 6, 4, 3, 1}; //0

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(new int[]{1, 2}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0, minByePrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minByePrice = Math.min(prices[i], minByePrice);
            maxProfit = Math.max(maxProfit, prices[i] - minByePrice);
        }
        return maxProfit;
    }
}
