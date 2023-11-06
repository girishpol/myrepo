package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.LinkedList;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		
		Random obj = new Random();
		
		for(int i=1;i<=5;i++) {
			int num = obj.nextInt(5);
			set.add(num);
			System.out.println(num);
		}
		
		Iterator<Integer> itr = set.iterator();
		Set<Integer> set1 = new HashSet<>(set);
		
		Set<Integer> set2 = new TreeSet<>(set);
		
		List<Integer> list = new LinkedList<>(set);
		
		System.out.println("Elements of linked hash set are : " + set);
		System.out.println("Elements of normal hash set are : " + set1);
		System.out.println("Elements of tree hash set are : " + set2);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<Integer> li = list.listIterator();
		
		System.out.println("Traverse list in forward direction :");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("Traverse list in backward direction :");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
