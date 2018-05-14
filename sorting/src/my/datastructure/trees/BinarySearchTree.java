package my.datastructure.trees;

public class BinarySearchTree {
	private TreeNode root;
	int data;
	
	public BinarySearchTree(int data){	
		root = new TreeNode(data);
	}
	
	public void insert(int data){
		
		if (root == null) return;
		root.insert(data);
	}
	
	public void inOrderTraversal(){
		if (root == null) 
			return ;
		else
			root.inOrderTraversal();
	}
	
	
	public TreeNode find(int data){
		if (root == null) 
			return null;
		
		return root.find(data);
	}
	
	public boolean checkBST(){
		if (root == null) return false;
		
		return root.checkBST();
	}
	
	public static void main(String[] args){	
		BinarySearchTree bst = new BinarySearchTree(5);
		
		bst.insert(3);
		bst.insert(6);
		bst.insert(1);
		bst.insert(8);
		bst.insert(9);
		bst.insert(2);
		
		bst.inOrderTraversal();
		System.out.println("\nDone.");
		
		TreeNode findNode = bst.find(9);
		
		System.out.println("\nFindNode value: " + findNode.getData());
		System.out.println("\nIs BST ? : " + bst.checkBST());
		
		findNode.setData(4);
		System.out.println("\nAfter modification, Is BST ? : " + bst.checkBST());
		
		findNode.setData(9);
		System.out.println("\nAfter modification, Is BST ? : " + bst.checkBST());
		
		
		
	}
	
}
