package Java_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 문제:
 * 데이터: 1,2,3,4,5,7,8,9
 * 2의 배수인 경우 데이터에 곱하기 2 
 * 3의 배수인 경우 데이터에 곱하기 3
 * 정답: 1,4,9,8,5,7,16,27
 */
		// 나머지 
//		System.out.println(10%3);

public class 문제3 {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4,5,7,8,9);
		int idx=0;
		for (int i : lst) {
			if (i % 2==0) {
				lst.set(idx,i*2);
			}
			else if (i % 3 ==0) {
				lst.set(idx,i*3);
			}
			idx+=1;
		}
		System.out.println(lst);
		
	}

}
