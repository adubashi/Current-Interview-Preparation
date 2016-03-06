package epicInterviewPreparation;

import java.util.*;

public class assonanceProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi, Whatsup? What are you doing? excess audible eating";
		String[] strArr = str.split(" "); //split by spaces
		ArrayList<Character> vowelList = new ArrayList<Character>();
		vowelList.add('a');
		vowelList.add('e');
		vowelList.add('i');
		vowelList.add('o');
		vowelList.add('u');
		int conWordPos = 0;
		for(int i=0; i<strArr.length; i++){
			if(vowelList.contains(strArr[i].charAt(0))){
				swap(i,conWordPos,strArr);
				conWordPos++;
				System.out.println(Arrays.toString(strArr));
			}

		}

		for(int i=0; i<strArr.length; i++){
			System.out.println(strArr[i]);
		}

	}
	
	public static void swap(int i, int j, String[] arr){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
		

}
