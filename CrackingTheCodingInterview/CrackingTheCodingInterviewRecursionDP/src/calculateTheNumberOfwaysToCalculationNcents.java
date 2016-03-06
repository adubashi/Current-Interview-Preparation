
public class calculateTheNumberOfwaysToCalculationNcents {
	//make change - exponential time
	public static int makeChange(int amount, int[] denoms, int index){
		if(index  >= denoms.length - 1){
			return 1;
		}
		int denomAmount = denoms[index];
		int ways = 0;
		for(int i = 0; i * denomAmount <= amount; i++){
			int amountRemaining = amount - i * denomAmount;
			ways += makeChange(amountRemaining, denoms, index + 1);
		}
		return ways;
	}
	
	public static int makeChange(int n){
		int[] denoms = {25,10,5,1};
		return makeChange(n,denoms,0);
	}
	
	//Non-exponential time. O(n cents * number of denominations)
	
	public static int makeChange(int amount, int[] denoms, int index, int[][] map){
		if(map[amount][index] > 0){
			return map[amount][index];
		}
		if(index >= denoms.length - 1){
			return 1;
		}
		int denomAmount = denoms[index];
		int ways = 0;
		for(int i = 0; i * denomAmount <= amount; i++){
			int amountRemaining = (amount - i) * denomAmount;
			ways += makeChange(amountRemaining, denoms, index + 1, map);
		}
		map[amount][index] = ways;
		return ways;
	}
}
