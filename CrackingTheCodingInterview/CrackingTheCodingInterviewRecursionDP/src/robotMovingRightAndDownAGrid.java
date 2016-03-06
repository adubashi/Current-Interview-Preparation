import java.util.*;
import java.awt.Point;
public class robotMovingRightAndDownAGrid {
	/*
	 * O(2^(x+y)) -- BADD!!!!! 
	 */
	public static boolean getPath(int x, int y, ArrayList<Point> path){
		if(y < 0 || x < 0 || !isFree(x,y)){
			return false;
		}
		
		boolean isAtOrigin = (x == 0) && (y == 0);
		
		if(isAtOrigin || getPath(x,y-1,path) || getPath(x-1,y,path) ){
			Point p = new Point(x,y);
			path.add(p);
			return true;
		}
		return false;
	}
	
	public static boolean isFree(int x, int y){
		return false;
	}
	
	//O(XY) --> Much better
	public static boolean getPath(int x, int y, ArrayList<Point> path, Hashtable<Point, Boolean> cache){
		if(y < 0 || x < 0 || !isFree(x,y)){
			return false;
		}
		
		Point p = new Point(x,y);
		if(cache.containsKey(p)){
			return cache.get(p);
		}
		
		boolean isAtOrigin = (x == 0) && (y == 0);
		boolean success = false;
		
		if(isAtOrigin || getPath(x,y-1,path,cache) || getPath(x-1,y,path,cache) ){
			path.add(p);
			success = true;
		}
		cache.put(p, success);
		return success;
	}

}
