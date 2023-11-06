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

public class NavigableSetDemo {
	
	public static void main(String[] args) {
	
	TreeSet<Integer> set = new TreeSet<>();
	
	
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	
	System.out.println("Elements of set are: " + set);
	
	System.out.println(set.floor(30));
	System.out.println(set.floor(25));
	System.out.println(set.floor(40));
	System.out.println(set.floor(15));
	System.out.println(set.floor(5));
	
	System.out.println(set.lower(30)); //20
	System.out.println(set.lower(25)); //20
	System.out.println(set.lower(40)); //30
	System.out.println(set.lower(15)); //10
	System.out.println(set.lower(5)); //null
	
	System.out.println(set.ceiling(30)); //30
	System.out.println(set.ceiling(25)); //30
	System.out.println(set.ceiling(40)); //40
	System.out.println(set.ceiling(15)); //20
	System.out.println(set.ceiling(55)); //null 
	
	System.out.println(set.higher(30)); //40
	System.out.println(set.higher(25)); //30
	System.out.println(set.higher(40)); //50
	System.out.println(set.higher(15)); //20
	System.out.println(set.higher(55)); //null
	
	set.pollFirst();
	set.pollLast();
	
	System.out.println("Elements of set are: " + set.descendingSet());
	
	
	
	}
	

}
