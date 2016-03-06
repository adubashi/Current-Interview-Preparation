
public class lowestCommonAncestorOfTwoNodesInAtree {
	public static class Entity{
	    public int count;
	    public Node node;
	 
	    public  Entity(int count, Node node){
	        this.count = count;
	        this.node = node;
	    }
	}
	
	public Node lowestCommonAncestor(Node root, Node p, Node q) {
        return lcaHelper(root, p, q).node;
    }
 
    public Entity lcaHelper(Node root, Node p, Node q){
        if(root == null) return new Entity(0, null);
 
        Entity left = lcaHelper(root.left, p, q);
        if(left.count==2) 
            return left;
 
        Entity right = lcaHelper(root.right,p,q);
        if(right.count==2) 
            return right;
 
        int numTotal = left.count + right.count;
        if(root== p || root == q){
            numTotal++;
        }
 
        return new Entity(numTotal, root);      
    }

}
