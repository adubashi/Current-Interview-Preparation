import java.util.*;
public class TrianglePathSum {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;
        if(triangle.size() == 1) return triangle.get(0).get(0);
        
        ArrayList<int[]> dp = new ArrayList<int[]>();
        
        for(int i = 0; i < triangle.size() - 1; i++){
            dp.add(new int[i + 1]);
        }
        
        return find(dp, 0, 0, triangle);
         
    }
    
    public int find(ArrayList<int[]> dp, int row, int colum, ArrayList<ArrayList<Integer>> triangle){
        if(row == triangle.size() - 1){
            return triangle.get(row).get(colum);
        }
        
        if(dp.get(row)[colum] == 0){
            dp.get(row)[colum] = triangle.get(row).get(colum) + 
                Math.min(find(dp, row + 1, colum, triangle), find(dp, row + 1, colum + 1, triangle));
        }
        
        return dp.get(row)[colum];
    }
    
    public int minimumTotalIter(ArrayList<ArrayList<Integer>> triangle) {
    	int[] total = new int[triangle.size()];
    	int l = triangle.size() - 1;
     
    	for (int i = 0; i < triangle.get(l).size(); i++) {
    		total[i] = triangle.get(l).get(i);
    	}
     
    	// iterate from last second row
    	//O(n^2)
    	for (int i = triangle.size() - 2; i >= 0; i--) {
    		for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
    			total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
    		}
    	}
     
    	return total[0];
    }

}
