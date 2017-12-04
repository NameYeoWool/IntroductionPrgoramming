package bstSorting;

public class TreeNode {
	
	private int data;
	private TreeNode leftChild,rightChild;
	
	public void setData(int data){
		this.data = data;
	}
	
	public TreeNode search(int key){
		TreeNode node = this;
		while(node != null){
			if( key == node.data) return node;
			if(key < node.data) node = node.leftChild;
			else node = node.rightChild;
		}
		
		return null;
	}
	public void insert(int value){
		// 같은 값은 없다.
		if(data == value) System.exit(1);
		// 루트 값보다 큰 경우
		else if(data < value){
			if(rightChild != null){
				rightChild.insert(value);
			}else{
				rightChild = new TreeNode();
				rightChild.data = value;
			}
		}
		// 루트 값보다 작은 경우
		else if(data > value){
			if(leftChild != null) leftChild.insert(value);
			else{
				leftChild = new TreeNode();
				leftChild.data = value;
			}
		}
	} // end insert
	
	public void inorder(){
		if(leftChild != null) leftChild.inorder();
		System.out.print(data + " ");
		if(rightChild != null) rightChild.inorder();
	}
	
}// end class
