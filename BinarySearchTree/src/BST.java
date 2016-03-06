
public class BST {
	
	public BSTNode root;
	 
    /* Constructor */
    public BST()
    {
        root = null;
    }
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(int data)
    {
        root = insert(root, data);
    }
    
    public BSTNode insert(BSTNode root, int data){
    	
    	if(root == null){
    		root = new BSTNode(data);
    	} else {
    		if(root.getData() >= data){
    			root.left = insert(root.left, data);
    		} else {
    			root.right = insert(root.right, data);
    		}
    		
    	}
    	
    	return root;
    }
    
    public int countNodes()
    {
        return countNodes(root);
    }
    
    
    private int countNodes(BSTNode r)
    {
        if (r == null){
        	return 0;
        } else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    
    public boolean search(int val)
    {
        return search(root, val);
    }
    private boolean search(BSTNode r, int val)
    {	
    	boolean found = false;
    	while ((r != null) && !found){
    		int rval = r.getData();
    		
    		if (val < rval){
                r = r.getLeft();
    		} else if(val > rval){
    			r = r.getRight();
    		} else {
    			found = true;
    			break;
    		}
    		found = search(r, val);
        }
    	return found;
    }
    
    //Tree traversals
    //Inorder
    public void inorder()
    {
    	inorder(root);
    	
    }
    
    private void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    
    public void preorder()
    {
    	preorder(root);
    	
    }
    
    private void preorder(BSTNode r)
    {
    	if(r != null){
    		System.out.print(r.getData() +" ");
    		preorder(r.getLeft());
    		preorder(r.getRight());
    	}
    }
    
    public void postorder()
    {
    	postorder(root);
    	
    }
    
    private void postorder(BSTNode r)
    {
    	if(r != null){
    		postorder(r.getLeft());
    		postorder(r.getRight());
    		System.out.print(r.getData() +" ");
    	}
    }
    
    
    
    
}
