package epicInterviewPreparation;

public class lookAndSay {
	
	public static void main(String Args[]){
		/*
		String result = "";
		char repeat =
		*/
		
		//lookSay("10");
		
		String num = "1";
		for(int i =1; i < 10; i++){	
			System.out.println(num);
			num = lookSay(num);
		}
		
		
		//System.out.println(lookSay("11"));
		
		
		
	}
	
	
	public static String lookSay(String number){
		String result= "";
		 
		//Initialization step
		char repeat= number.charAt(0);
		number = number + " ";
		int times= 1;
	 
		char[] array = number.toCharArray();
		
		for(int i = 1; i < array.length; i++){
			char actual = array[i];
			if(actual != repeat){
				//set result
				result = result + times + "" + repeat;
				//Reset process
				times= 1;
				repeat= actual;
			}else{
				times+= 1;
			}
		}
		return result.toString();
	}

}
