import java.util.*;
public class generateValidParentheses {
	//Generate valid parentheses
	
	public static Set<String> generateParens(int remaining){
		Set<String> set = new HashSet<String>();
		if(remaining == 0){
			set.add("");
		} else {
			Set<String> prev = generateParens(remaining - 1);
			for(String str : prev){
				for(int i = 0; i < str.length(); i++){
					String s = "";
					set.add(s);
				}
				set.add("()"+str);
			}
		}
		return set;	
	}
	
	public static String insertInside(String str, int leftIndex){
		String left = str.substring(0, leftIndex+1);
		String right = str.substring(leftIndex + 1, str.length()-1);
		return left + "()" + right;
	}
	
	public static void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count){
		if(leftRem < 0 || rightRem < leftRem){
			return;
		}
		if(leftRem == 0 && rightRem == 0){
			String s = String.copyValueOf(str);
			list.add(s);
		} else {
			if(leftRem > 0){
				str[count] = '(';
				addParen(list,leftRem -1, rightRem,str,count+1);
			}
			if(rightRem > leftRem){
				str[count] = ')';
				addParen(list,leftRem, rightRem - 1, str,count+1);
			}
		}
	}
	
	public static ArrayList<String> generateParens2(int count){
		char[] str = new char[count*2];
		ArrayList<String> list = new ArrayList<String>();
		addParen(list,count,count,str,0);
		return list;
	}
}
