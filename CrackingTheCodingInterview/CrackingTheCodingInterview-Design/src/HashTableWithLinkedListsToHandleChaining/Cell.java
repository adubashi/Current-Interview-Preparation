package HashTableWithLinkedListsToHandleChaining;

public class Cell<String, Integer> {
	private String key;
	private Integer value;
	public Cell(String k, Integer v){
		key = k;
		value = v;
	}
	
	public boolean equivalent (Cell<String, Integer> c){
		return equivalent(c.getKey());
	}
	
	public boolean equivalent(String k){
		return key.equals(k);
	}
	
	public String getKey(){return key;}
	public Integer getValue(){return value;}

}
