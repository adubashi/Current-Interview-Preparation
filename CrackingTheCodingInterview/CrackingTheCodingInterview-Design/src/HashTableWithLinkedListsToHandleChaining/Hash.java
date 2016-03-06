package HashTableWithLinkedListsToHandleChaining;
import java.util.*;
public class Hash<String, Integer> {
	private final int MAX_SIZE = 10;
	LinkedList<Cell<String,Integer>>[] items;
	
	public Hash(){
		items = (LinkedList<Cell<String, Integer>> []) new LinkedList[MAX_SIZE];
	}
	
	public int hashCodeOfKey(String key){
		return key.toString().length() % items.length;
	}
	
	public void put(String key, Integer value){
		int x = hashCodeOfKey(key);
		if(items[x] == null){
			items[x] = new LinkedList<Cell<String, Integer>>();
		}
		LinkedList<Cell<String,Integer>> collided = items[x];
		
		for(Cell<String,Integer> c : collided){
			if(c.equivalent(key)){
				collided.remove(c);
				break;
			}
		}
		Cell<String, Integer>  cell = new Cell<String, Integer>(key, value);
		collided.add(cell);
		
		
	}
	
	public Integer get(String key){
		int x = hashCodeOfKey(key);
		if(items[x] == null){
			return null;
		}
		
		LinkedList<Cell<String,Integer>> collided = items[x];
		
		for(Cell<String,Integer> c : collided){
			if(c.equivalent(key)){
				return c.getValue();
			}
		}
		
		return null;
	}
	
	
	

}
