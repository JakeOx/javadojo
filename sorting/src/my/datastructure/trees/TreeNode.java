package my.datastructure.trees;

public class TreeNode {
	
	private TreeNode leftChild;
	private TreeNode rightChild;
	private int data;
	
	public TreeNode (int data){
		this.data = data;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public void insert(int data) {
		if (data < this.data){
			if (leftChild != null){
				leftChild.insert(data);
			}else{
				leftChild = new TreeNode(data);
			}
		}else{
			if (rightChild != null){
				rightChild.insert(data);
			}else{
				rightChild = new TreeNode(data);
			}
		}
	}
	
	public void inOrderTraversal(){
		if (leftChild != null)
			leftChild.inOrderTraversal();
		System.out.print(", " + data);
		if (rightChild != null)
			rightChild.inOrderTraversal();
	}
	
	public boolean checkBST(){
		boolean isFlagTrue = true;
		
		if (leftChild != null ){
			if (getLeftChild().getData() < this.getData()){
				isFlagTrue = getLeftChild().checkBST();
			}else{
				return false;
			}
		}
		
		//No need to check the Right side, should the left side check fail
		if (! isFlagTrue)
			return false;
		
		if (rightChild != null){
			if (getRightChild().getData() > this.getData()){
				isFlagTrue = getRightChild().checkBST();
			}else{
				return false;
			}
		}
		
		return isFlagTrue;
	}
	
	
	
	public TreeNode find(int data){
		TreeNode node=null;
		
		if (data == this.data) 
			return this;
		
		if ((data < this.data ) && (leftChild != null)){
			node = leftChild.find(data);
		}
		
		if ((data > this.data) && (rightChild != null)){
			node = rightChild.find(data);
		}
		
		return node;
	}
	
	

}
