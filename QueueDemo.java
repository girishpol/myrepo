package collections;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println("Elements of queue are: " + queue);
		
		System.out.println("Head of the queue is: " + queue.peek());
		
		System.out.println("Head removed: " + queue.poll());
		
		System.out.println("Head of the queue is: " + queue.element());
		
		queue.removeAll(queue);
		
		System.out.println("Head of the queue is: " + queue.peek());
		
	}

}
