package epic;

public class uniqueElements {
	
	
	
	public static void main(String Args[]){
		
		int[] array = {1,1,2,2,3,3};
		
		uniqueElements(array);
		
	}
	
	
	public static void uniqueElements(int[] a){
		
		int i = a[0];
		System.out.println(i);
		
		for(int j = 0; j < a.length; j++){
			if(a[j] != i){
				System.out.println(a[j]);
				i = a[j];
			}
			
		}
	}

}
