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

public class TreeSetOfStrings {
	
	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());
		
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyzgfdf"));
		set.add(new StringBuffer("mnoee"));
		set.add(new StringBuffer("efgqfghfghf"));
		
		System.out.println("Elements of Tree Set are: " + set);
	}

}
