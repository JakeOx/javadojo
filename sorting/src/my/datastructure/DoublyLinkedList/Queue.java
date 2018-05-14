package my.datastructure.DoublyLinkedList;

public class Queue {
	
	public static class Node {
		private int data;
		private Node next;
		private Node (int data){
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;

	public void enqueue(int data){
		Node node = new Node(data);
		
		if(tail !=null){
			tail.next=node;
		}else{
			tail=node;
		}
		
		if(head==null){
			head = node;
		}
	}
	
	
	public int dequeue(){
		int data = head.data;
		head = head.next;
		if(head == null){
			tail =null;
		}
		return data;
	}
	
	
}
