
public class MinHeapTest {
	public static void main(String args[]){
		System.out.println("The Max Heap is ");
	    MinHeap maxHeap = new MinHeap(15);
	    maxHeap.insert(5);
	    maxHeap.insert(3);
	    maxHeap.insert(17);
	    maxHeap.insert(10);
	    maxHeap.insert(84);
	    maxHeap.insert(19);
	    maxHeap.insert(6);
	    maxHeap.insert(22);
	    maxHeap.insert(9);
	    maxHeap.maxHeap();
	   

	    maxHeap.print();
	    System.out.println("The min val is " + maxHeap.remove());
		
	}

}