package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.add(1, 20);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
