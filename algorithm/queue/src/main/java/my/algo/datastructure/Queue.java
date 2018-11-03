package my.algo.datastructure;


public class Queue{

    int front, rear, size;
    int  capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0; 
        //rear = capacity - 1;
        rear =1;
        System.out.println("Value of rear: " + rear) ;
        System.out.println((this.rear + 1)%this.capacity);
        array = new int[this.capacity];

        Map<String, String> map = new HashMap<K,V>()
          
   }

   public static void main(String[] args) 
    {
       // Queue queue = new Queue(1000);

       int capacity=10;
       for(int i=1; i<=10; i++){
        System.out.println(i);
        int k = capacity%i;
        System.out.println(k);
        System.out.println("--");
        //System.out.println((i + 1)%capacity);
       }

       System.out.println(Integer.MIN_VALUE);
           
        //queue.enqueue(10);
        //queue.enqueue(20);
        //queue.enqueue(30);
        //queue.enqueue(40);
       
        // System.out.println(queue.dequeue() + 
        //              " dequeued from queue\n");
       
        // System.out.println("Front item is " + 
        //                        queue.front());
          
        // System.out.println("Rear item is " + 
        //                         queue.rear());
    }
}