package epicInterviewPreparation;

public class createAnEquation {
	
	public static void main(String Args[]){
		printEquation("15510");
		printEquation("121224");
		
	}
	//If it's even --> flag = 0;
	//If it's odd --> odd = 1;
	
	
	
	//Throws exception
	public static void printSplits(String f){
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int n = f.length()/2; 
		
		
		//System.out.println(n); 
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n+i+1;j++) 
			{ 
				num1 = Integer.parseInt(f.substring(0, i+1)); 
				num2 = Integer.parseInt(f.substring(i+1, j+1)); 
				num3 = Integer.parseInt(f.substring(j+1,f.length())); 	
				int tmp = check(num1,num2,num3);	
				if(tmp == 0){
					continue;
				} else {
					break;
				}
				
			}
		}	
	}
	
	public static int check(int num1, int num2, int num3){
		if(num1 + num2 == num3){
			System.out.println(num1 + "+" + num2 + "=" + num3);
			return 1;
		} else if(num1 + num3 == num2){
			System.out.println(num1 + "+" + num3 + "=" + num2);
			return 2;
		}else if(num3 + num2 == num1){
			System.out.println(num3 + "+" + num2 + "=" + num1);
			return 3;
		} else {
			return 0;
		}
		
	}
	

	
	public static void printEquation(String f){
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int n = f.length()/2; 
		
		int flag = 0;
		if(f.length()  % 2 == 0){
			flag = 0;
		} else {
			flag = 1;
		}	
		
		
		//System.out.println(n); 
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n+i+flag;j++) { 
				num1 = Integer.parseInt(f.substring(0, i+1)); 
				num2 = Integer.parseInt(f.substring(i+1, j+1)); 
				num3 = Integer.parseInt(f.substring(j+1,f.length())); 	
				int tmp = check(num1,num2,num3);	
				if(tmp == 0){
					continue;
				} else {
					break;
				}
				
			}
		}	
		
	}
	
	

}
