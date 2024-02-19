package Java_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex01 {
	public static void main(String[] args) {
		boolean isMarried = false; 
		String str = isMarried ? "Yes" : "No";
		System.out.println(str);

		// 3항 다항식을 if else문으로 변경 
		if (isMarried) {
		  str = "Yes";
		} else {
		  str = "No";
		}
		System.out.println(str);
	}

}
