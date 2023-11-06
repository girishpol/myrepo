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

public class TreeSetOfStringBuffers {
	
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("abc");
		set.add("xyz");
		set.add("mno");
		set.add("efg");
		
		System.out.println("Elements of Tree Set are: " + set);
	}

}
