package my.hackerrank.crackingcode;

public class Node {
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return next;
	}
	
	
	@Override
	public String toString(){
		return Integer.toString(data);
	}

}
