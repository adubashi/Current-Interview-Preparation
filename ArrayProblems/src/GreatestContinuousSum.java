
public class GreatestContinuousSum {
	
	public static void main(String Args[]){
	String string = "2,3,-2,-1,10";
    String[] numbers = string.split(",");
    int max_so_far = 0;
    int max_ending_here = 0;
    for (String num : numbers) {
        int x = Integer.parseInt(num);
        max_ending_here = Math.max(0, max_ending_here + x);
        max_so_far = Math.max(max_so_far, max_ending_here);
    }
    System.out.println(max_so_far);
	}

}
