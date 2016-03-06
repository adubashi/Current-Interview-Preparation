package epic;

public class seedNumber {
	
	public static void main(String Args[]){
		int n;
		n = 1716;

		  for(int i=1;i<=n;++i){
		    if(n%i==0){
		      if(prod(i)==n)
		        System.out.println(i);
		    }
		  }
	}
	
	public static int prod(int n){
		  int res=n;
		  while(n!=0){
			int dig = n % 10;
		    res = res * dig;
		    n/=10;
		  }
		  return res;
	}
}
