package epicInterviewPreparation;

public class minimumCoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int[] coins = {1,5,10,25};
		
		int k = minCoinsDP(coins,4,17);
		
		System.out.println(k);

	}
	
	public static int minCoins(int[] coins, int m, int value){
		if(value == 0){
			return 0;
		}
		
		int result = Integer.MAX_VALUE;
		
		for(int i = 0; i < m; i++){
			
			if(coins[i] <= value){
				int subres = minCoins(coins,m,value - coins[i]) + 1;				
				if(subres < result){
					result = subres;
				}
			}	
		}
		return result;	
	}
	
	public static int minCoinsDP(int[] coins, int m, int value){
		int[] table = new int[value+1];
		
		//Base Case
		table[0] = 0;
		
		for(int i = 1; i <= value; i++){
			table[i] = Integer.MAX_VALUE;
		}
		
		
		
		for(int i = 1; i <= value; i++){
			for(int j = 0; j < m; j++){
				if(coins[j] <= i){
					int subres = table[i - coins[j]] + 1;
					if(subres < table[i]){
						table[i] = subres; 
					}
				}
			}
			
			
		}
		
		return table[value];
		
	}

}
