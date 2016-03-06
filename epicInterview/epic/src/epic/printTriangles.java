package epic;

public class printTriangles {
	
	public static void main(String args[]){
		printStar(3);
	}
	
	
	public static void printStar(int numLine)
	{
	   String line = "";
	   for (int i=0; i<numLine; i++)
	   {
	       line = line + "*";
	       System.out.println(line);
	   }
	}

}
