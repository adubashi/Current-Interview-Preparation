
public class powerInOlogn {
	public static double pow(double x, int n){
		if(n == 0){
			return 1;
		} 
		if(n == 1){
			return x;
		}
		
		//double temp = pow(x, n/2);
		if(n % 2 == 0){
			return pow(x,n/2) * pow(x,n/2);
		} else {
			return x * pow(x,n-1);
		}
	}
	
	public static void main(String args[]){
		System.out.println(pow(2,5));
	}

}
