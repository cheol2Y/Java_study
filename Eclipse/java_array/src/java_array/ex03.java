package java_array;

import java.util.ArrayList;  // ArratList 선언 시
import java.util.Arrays;
import java.util.List;
public class ex03 {

	
	
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>() {
		    {
		        add("1");
		        add("2");
		        add("3");
		    }
		};
		List<String> s1 = new ArrayList<String>(Arrays.asList(new String[]{ "4", "5", "6" }));
		List<String> s2 = new ArrayList<String>(Arrays.asList("7", "8", "9")); // 
		List<String> s3 = new ArrayList<>(Arrays.asList("17", "8", "9"));
		
		System.out.println("1:"+s);
		System.out.println("2:"+s1);
		System.out.println("3:"+s2);
		System.out.println("4:"+s3);
		
		List<String> lst1 = new ArrayList<>(Arrays.asList("17", "8", "9"));
		System.out.println("5:"+lst1);
		s.add("34");
		s.set(0, "10");
		System.out.println("6:"+s);
		for(int i =0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		

	}

}
