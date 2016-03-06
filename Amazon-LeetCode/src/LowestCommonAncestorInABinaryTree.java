
public class LowestCommonAncestorInABinaryTree {
	public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q){
		BinaryTreeNode m = root;
		if(m.data > p.data && m.data < q.data){
			return m;
		} else if(m.data > p.data  && m.data > q.data){
			return lowestCommonAncestor(root.left,p,q);
		} else if(m.data < p.data && m.data < q.data){
			return lowestCommonAncestor(root.right,p,q);
		}
		return root;
	}

}
