package my.hackerrank.crackingcode;

public class LinkedList {
	Node head;
	
	public void addAtHead(int data){
		if (head == null){
			head = new Node(data);
		}else{
			Node node = new Node(data);
			head.setNext(node);
		}
	}
	
	/*
	 * Append to end of the linked List
	 *  this will be a liner operation to add at end of the Linked list.
	 *  so better operation to use is addAtHead
	 */
	public void append(int data){
		if (head == null){
			addAtHead(data);
		}else{
			Node current = head;
			Node next=current.getNext();
			
			//Walkthru to end
			while(next != null){
				current = next;
				next = current.getNext();
			}
			Node node = new Node(data);
			current.setNext(node);
		}
	}
	
	
	public boolean hasCycle_Old(Node head) {
		if (head == null)
			return false;
		
		Node prev = head;
		Node current = head;
		Node next = current.getNext();
		
		while(next != null){
			
			//Compare next to prev
			if (next == prev){
				return true;
			}
			
			//Shift pointers
			prev = current;
			current=next;
			next = current.getNext();
		}
		return false;
	}
	
	public boolean hasCycle(Node head){
		if (head == null)
			return false;
		
		Node slow = head.next;
		Node fast = head.next.next;
		
		while (slow !=null && fast !=null && fast.next != null){
			
			if (slow == fast)
				return true;
			
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
	
	
	public Node getLast(){
		
		Node current = head;
		Node next = current.getNext();
		
		while(next !=null){
			current=next;
			next = current.next;
		}
		return current;
	}
	
	
	@Override
	public String toString(){
		Node current = head;
		StringBuilder builder = new StringBuilder();
		Node next=current.getNext();
		while (next != null){
			builder.append(current.toString()).append(",");
			current = next;
			next=current.getNext();
		}	
		return builder.append(current.toString()).toString();
	}
	
	
	public Node getHead(){
		return head;
	}

}
