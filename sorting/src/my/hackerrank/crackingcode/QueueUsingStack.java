package my.hackerrank.crackingcode;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

	public static class MyQueue<T> {
		Stack<T> enqueueStack = new Stack<T>();
		Stack<T> dequeueStack = new Stack<T>();
		private static int lastOperation = 1;

		//Optimized it by, allowing it to still store incoming values without moving to the dequeue stack yet, as it will be far back in Q anyway
		public void enqueue(T value) { // Push onto newest stack
			lastOperation = 1;
			enqueueStack.push(value);
		}
		
		public T peek() {
			if ((lastOperation !=2 || lastOperation!=3) && (dequeueStack.isEmpty())){
				copyStack(enqueueStack, dequeueStack);
			}
			if(dequeueStack.isEmpty()){
				throw new RuntimeException("Cannot peek from an empty Q");
			}
			lastOperation =3;
			return dequeueStack.peek();
		}

		//Optimized: by limiting movements of copy from enqueueStack till the dequeue stack is exausted of all items.
		public T dequeue(){
			if ((lastOperation !=2 || lastOperation !=3) && (dequeueStack.isEmpty())){
				copyStack(enqueueStack, dequeueStack);
			}
			
			if(dequeueStack.isEmpty()){
				throw new RuntimeException("Cannot pop from an empty Q");
			}
			
			lastOperation =2;
			return dequeueStack.pop();	
		}

		private void copyStack(Stack<T> fromStack, Stack<T> toStack) {
			
			while (!fromStack.isEmpty()){
				toStack.push(fromStack.pop());
			} 
		}
	}
	
	 public static void main(String[] args) {
	        MyQueue<Integer> queue = new MyQueue<Integer>();
	        
	        String input = "4 1 14 1 30 3 2";  
	        Scanner scan = new Scanner(input).useDelimiter("\\s");
	        int n = scan.nextInt();
	        
	        //Scanner scan = new Scanner(System.in);
	        //int n = scan.nextInt();
	        
	        for (int i = 0; i < n; i++) {
	            int operation = scan.nextInt();
	            if (operation == 1) { // enqueue
	                queue.enqueue(scan.nextInt());
	            } else if (operation == 2) { // dequeue
	                queue.dequeue();
	            } else if (operation == 3) { // print/peek
	                System.out.println(queue.peek());
	            }
	        }
	        scan.close();
	    }
	
}
