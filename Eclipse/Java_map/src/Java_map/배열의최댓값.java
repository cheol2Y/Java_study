package Java_map;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class 배열의최댓값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.max(30,50));
		
		int[] arr ={10,20,3,4,5,6};
		
		int max = Integer.MIN_VALUE; // 최솟값으로 초기화

		for (int value : arr) {
		    if (value > max) {
		        max = value;
		    }
		}

		System.out.println("최댓값: " + max);
		
		int[] array = {4, 2, 9, 5, 1};
		int max2 = Arrays.stream(array).max().orElseThrow(NoSuchElementException::new);

		System.out.println("최댓값: " + max2);
	}

}
