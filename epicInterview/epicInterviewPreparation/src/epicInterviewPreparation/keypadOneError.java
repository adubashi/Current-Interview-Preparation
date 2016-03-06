package epicInterviewPreparation;

public class keypadOneError {
	
	public static void main(String Args[]){
		int[] a = {1,6,7,8};
		allowed(a);
		
	}
	
	public static void allowed(int[] a){
		int[][] keypad = {{1,2,3},{4,5,6},{7,8,9}};
		int[] code = {1,5,7,8};
		boolean mistake = false;
		for(int i = 0; i < a.length; i++){
			if(a[i] == code[i]){
				continue;
			} else if(a[i] != code[i]){
				if(mistake == true){
					return;
				}
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 3; k++){
						if(code[i] == keypad[j][k]){
							boolean problem = true;
							mistake = true;
							if(j-1 >= 0 && keypad[j-1][k] == a[i]){
								System.out.println(keypad[j-1][k]);
								System.out.println("Acceptable Mistake");
								problem = false;
							} else if(j+1 <= 2 && keypad[j+1][k] == a[i]){
								System.out.println(keypad[j+1][k]);
								System.out.println("Acceptable Mistake");
								problem = false;
							} else if(k+1 <= 2 && keypad[j][k+1] == a[i]){
								System.out.println(keypad[j][k+1]);
								System.out.println("Acceptable Mistake");
								problem = false;
							} else if(k-1 >= 0 && keypad[j][k-1] == a[i] ){
								System.out.println(keypad[j][k-1]);
								System.out.println("Acceptable Mistake");
								problem = false;
							}
							if(problem){
								return;
							}
						}
							
					}
				}
			}
		}
		
		System.out.println("Allowed!");
		
	}

}
