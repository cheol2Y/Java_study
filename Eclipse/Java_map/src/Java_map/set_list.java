package Java_map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set_list {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(10,10,10,10,10));
		System.out.println(set);
		System.out.println(set.size());
		
		List<String> list = List.of("item1", "item2", "item3");
		System.out.println(list);
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,5,5,3,2));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9,4,5,6));
		System.out.println(s1.size());
		System.out.println(s2);
//		교집합
//		s1.retainAll(s2);
//		System.out.println(s1);
		
//		합집합
//		s1.addAll(s2); 
//		System.out.println(s1);
//		차집합
		s1.removeAll(s2); 
		System.out.println(s1);
		
	}

}
