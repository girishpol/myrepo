package collections;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {
	
	public static void main(String[] args) {
		String[] strs = {"Girish","Ajay","Ram","Harish"};
		
		//System.out.println("Binary Search Demo : " + Arrays.binarySearch(strs, "Girish"));
		
		System.out.println("Before sort:");
		for(String str:strs) {
			System.out.println(str);
		}
		
		
		Arrays.sort(strs);
		System.out.println("After normal sort:");
		for(String str:strs) {
			System.out.println(str);
		}
		
	/*	Arrays.sort(strs, new ArrayComparator());;
		System.out.println("After descending sort:");
		for(String str:strs) {
			System.out.println(str);
		}*/
		
		System.out.println("Minimum element in array :" + Collections.min(Arrays.asList(strs)));
		System.out.println("Maximum element in array :" + Collections.max(Arrays.asList(strs)));
		
		System.out.println("Binary Search Demo : " + Arrays.binarySearch(strs, "Girish"));
	}

}
