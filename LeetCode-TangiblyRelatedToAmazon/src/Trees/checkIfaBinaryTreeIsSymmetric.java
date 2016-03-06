package Trees;

public class checkIfaBinaryTreeIsSymmetric {
	public boolean isSymmetric(Node l, Node r) {
		if (l == null && r == null) {
			return true;
		} else if (r == null || l == null) {
			return false;
		}
	 
		if(l.data != r.data){
			return false;
		}
		if(!isSymmetric(l.left,r.left)){
			return false;
		}
		if(!isSymmetric(l.right,r.right)){
			return false;
		}
		
		return true;
	}

}
