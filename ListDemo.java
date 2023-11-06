package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
	
	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	
	list.add("Girish");
	list.add("Satish");
	list.add("Amit");
	list.add("Anish");
	
	Collections.sort(list);
	
	System.out.println("Elements of list are :"+ list);
	
	/*Collections.reverse(list);
	
	System.out.println("Elements of list are :"+ list);*/
	
	System.out.println("Binary search result :" + Collections.binarySearch(list, "Girish"));
	System.out.println("Binary search result :" + Collections.binarySearch(list, "Amit"));
	System.out.println("Binary search result :" + Collections.binarySearch(list, "T"));
	}

}
