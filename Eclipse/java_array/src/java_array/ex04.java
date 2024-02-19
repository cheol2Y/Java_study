package java_array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ex04 {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(10,10,10,10,10));

		System.out.println(lst);
		for (int i = 0; i < lst.size(); i++) {
			lst.set(i, 10*(i+1));
		}
		System.out.println(lst);
	}

}
