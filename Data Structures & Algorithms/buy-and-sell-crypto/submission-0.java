class Solution {
    public int maxProfit(int[] prices) {
        int minValue=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        for(int price:prices){
            minValue=Math.min(minValue,price);
            maxProfit=Math.max(price-minValue,maxProfit);
        }
        return maxProfit;
    }
}
