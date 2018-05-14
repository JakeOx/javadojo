package my.hackerrank.crackingcode;

public class LinkedListDemo {

	
	public static void main(String[] args){		
		LinkedList list = new LinkedList();
		list.addAtHead(1);
		list.append(2);
		list.append(3);
		list.append(4);
		
		Node node1 = list.getLast();
		
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.append(10);
		
		
		Node node2 = list.getLast();
		node2.setNext(node1);
		
		if (list.hasCycle(list.getHead())){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
