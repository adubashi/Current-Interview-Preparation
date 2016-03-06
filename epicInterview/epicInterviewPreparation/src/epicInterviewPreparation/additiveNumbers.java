package epicInterviewPreparation;

import java.util.*;

public class additiveNumbers {
	
	public static int test = 0;
	
	public static void main(String args[]){
		long i = 1;
		long k = 10000000;
		//List<Long> list = allFibNumbers(i,k);
		
		//System.out.println(list.toString());
		
		generator(1,1000000);
	}


	public static void generator(int start, int end) {
		
		int halflength = (end + "").length() / 2;
		int maxgenerator = (int) Math.pow(10, halflength);

		for (int i = 1; i < maxgenerator; i++) {
			for (int j = 1; j < maxgenerator; j++) {
				fibonacci(start, end, i, j);
			}
		}
	}

	public static void fibonacci(int start, int end, int f, int s) {
		// f = 1;
		// s = 2;
		String res = Integer.toString(f) + Integer.toString(s);

		while (Integer.parseInt(res) < start) {
			int temp = f + s;
			res += temp;
			f = temp;
		}

		while (Integer.parseInt(res) < end) {
			int temp = f + s;
			res += temp;
			if(res.length() >= 10){
				break;
			}
			if (Integer.parseInt(res) < end){

			} else {
				continue;
			}
			System.out.println(res);
			f = temp;
		}
	}
	
	public static boolean isAdditive(String num){

        if(num.length() % 3 != 0){
            return false;
        }

        for (int i=1; i<= num.length()/3; i++){
            int j=0; boolean flag = true;
            while(j < num.length()){
                int a = Integer.parseInt(num.substring(j, j + i));
                j = j+i;
                int b = Integer.parseInt(num.substring(j , j+i));
                j = j+i;
                int c = Integer.parseInt(num.substring(j, j+i));
                j=j+i;

                if(c != a+b){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;

    }
	
	public static List<Long> allFibNumbers(long m, long n){
		List<Long> list = new ArrayList<Long>();
		String s = String.valueOf(n);
		long i = 1;
		while(String.valueOf(i).length() * 2 < s.length()){
			long[] dp = new long[s.length()];
			dp[0] = i;
			dp[1] = i;
			String temp = String.valueOf(dp[0]) + String.valueOf(dp[1]);
			for(int j = 2; j < dp.length; j++){
				dp[j] = dp[j - 1] + dp[j - 2];
				temp += String.valueOf(dp[j]);
				if(Long.valueOf(temp).longValue() < n && Long.valueOf(temp).longValue() > m){
					list.add(Long.valueOf(temp).longValue());
				}
				if(Long.valueOf(temp).longValue() > n) break;
			}
			i++;
		}
		return list;
	}
	
	

	


}
