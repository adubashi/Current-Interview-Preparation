package epic;

public class SMSproblem {
	
	public static void main(String Args[]){
		decode("2222#2");
	}
	
	public static void decode(String str){
		for(int i = 0; i < str.length(); i++){
			
			char firstChar = str.charAt(i);
			int count = 1;
			int j;
			for(j = i + 1; j < str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					count++;
				} else {
					break;
				}
			}
			char t;
            if (str.charAt(i) != '#') {
                 t = getChar(str.charAt(i), count);
                 System.out.print(t);
            }
			i = j - 1;
			
			
			System.out.println(firstChar);
			System.out.println(count);
			
			
		}
	}
	
	
	public static char getChar(char character, int count){
		
		switch(character){
		case '2':
			 if (count % 3 == 1) return 'A';
             if (count % 3 == 2) return 'B';
             if (count % 3 == 0) return 'C';
			break;
		case '3':
            if (count % 3 == 1) return 'D';
            if (count % 3 == 2) return 'E';
            if (count % 3 == 0) return 'F';
            break;
        case '4':
            if (count % 3 == 1) return 'G';
            if (count % 3 == 2) return 'H';
            if (count % 3 == 0) return 'I';
            break;
        case '5':
            if (count % 3 == 1) return 'J';
            if (count % 3 == 2) return 'K';
            if (count % 3 == 0) return 'L';
            break;
        case '6':
            if (count % 3 == 1) return 'M';
            if (count % 3 == 2) return 'N';
            if (count % 3 == 0) return 'O';
            break;
        case '7':
            if (count % 4 == 1) return 'P';
            if (count % 4 == 2) return 'Q';
            if (count % 4 == 3) return 'R';
            if (count % 4 == 0) return 'S';
            break;
        case '8':
            if (count % 3 == 1) return 'S';
            if (count % 3 == 2) return 'T';
            if (count % 3 == 0) return 'U';
            break;
        case '9':
            if (count % 4 == 1) return 'W';
            if (count % 4 == 2) return 'X';
            if (count % 4 == 3) return 'Y';
            if (count % 4 == 0) return 'Z';
            break;
		}
		
		
		
		
		return '0';
	}
	

}
