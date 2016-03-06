
public class HashMap {
	private final static int TABLE_SIZE = 128;
	 
    HashEntry[] table;

    HashMap() {
          table = new HashEntry[TABLE_SIZE];
          for (int i = 0; i < TABLE_SIZE; i++)
                table[i] = null;
    }
    
    //Uses linear probing to find the the correct place where the
    //key value pair is stored 
    public int get(int key) {
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key){
              hash = (hash + 1) % TABLE_SIZE;
        }
        if (table[hash] == null){
        	return -1;
        }else {
        	return table[hash].getValue();
        }
       
    }
    
    //Uses linear probing to find the correct place to put the entry 
    public void put(int key, int value) {
        int hash = (key % TABLE_SIZE);
        int count = 0;
        while ((table[hash] != null && table[hash].getKey() != key) || count != 128 )
              hash = (hash + 1) % TABLE_SIZE;
        	  count++;
        table[hash] = new HashEntry(key, value);
    }


}
