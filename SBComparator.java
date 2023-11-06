package collections;

import java.util.Comparator;

public class SBComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		StringBuffer s1 = (StringBuffer) o1;
		StringBuffer s2 = (StringBuffer) o2;
		if(s1.length() < s2.length()) {
			return -1;
		}else if(s1.length() > s2.length()) {
			return 1;
		}else {
			return s1.compareTo(s2);
		}
		
	}
	
	

}
