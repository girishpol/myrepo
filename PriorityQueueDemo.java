package collections;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(new IntegerComparator());
		
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		
		System.out.println("Remove head " + pq.poll());
		System.out.println("Remove head " + pq.poll());

	}

}
