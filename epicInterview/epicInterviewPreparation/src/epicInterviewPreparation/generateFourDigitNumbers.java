package epicInterviewPreparation;

public class generateFourDigitNumbers {
	
	public static void main(String Args[]){
		generate("",4);
		
	}
	
	
	public static void generate(String temp, int level){
		if( level == 0){
			System.out.println(temp);
		} else {
			for(int i = 0; i < 10; i++){
				if(!temp.endsWith(String.valueOf(i))) {
					if(i != 4) {
						generate(temp + i,level - 1);
					} else {
					//Check for if it starts with 4(takes into account initial(temp+i)
						if((temp + i).startsWith(String.valueOf(i))) {
							generate(temp + i,level - 1);                                
						}
					}
				}
			}
		}
	}

}
