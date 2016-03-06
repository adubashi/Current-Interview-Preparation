
public class SwapTwoVariablesWithOutAtempVariables {
	
	public static void swap(int a, int b){
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void swap2(int a, int b){
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);	
	}

}
