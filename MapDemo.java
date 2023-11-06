package collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;


public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(5, 40);
		map.put(4, 40);
		
		Set<Integer> keySet = map.keySet();
		
		Collection<Integer> values = map.values();
		
		System.out.println("Keys :" + keySet);
		System.out.println("Values :" + values);
		
		for(Integer key: keySet) {
			System.out.println("Key :" + key + " Value :" + map.get(key));
		}
	}

}
