package epicInterviewPreparation;

public class anagramsWhereCapitalsSpecialsCannotMove {

	public static void main (String args[]){
		String test = "Hi8Test(*!good";

			for (int i = 0; i<test.length(); i++){
					reorderString(test, i);
			}

		}

		public static void reorderString(String test, int index){
		char [] temp = test.toCharArray();

			for (int j = index+1; j<test.length(); j++){
				if(temp[j]>='a' && temp[j]<='z'){
					swap(temp, index, j);
					System.out.println(new String (temp));
					swap(temp, index, j);
				}
			}
		}

		public static void swap(char[] temp, int index, int j) {
				char tempChar = temp[index];
				temp[index] = temp[j];
				temp[j] = tempChar;
			}
		}
