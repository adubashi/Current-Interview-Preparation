
public class findMaxStockProfit {
	
	public static void main(String args[]){
		int[] prices = {2,5,10,20,25,30};
		
		System.out.println(maxProfit(prices));
		
	}

	
	public static int maxProfit(int[] prices){
		int profit = 0;
		int minElement = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++){
            profit = Math.max(profit, prices[i]-minElement);
            minElement = Math.min(minElement, prices[i]);
		}
		
		return profit;
	}

}
