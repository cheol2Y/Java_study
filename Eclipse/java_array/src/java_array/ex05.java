package java_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ex05 {
	public static void main(String[] args) {
		List<Integer> score = new ArrayList<Integer>(Arrays.asList(100,80,50,90,70));
	
		int sum = 0 ;
		int max = 0 ;
		int min = 100;
		for (int i = 0; i< score.size(); i++) 
		{
			sum += score.get(i);
			
			if(max < score.get(i)) 
			{
				max = score.get(i);
			}
			if(min > score.get(i)) 
			{
				min = score.get(i);
			}
		}
		float avg = (float)sum / score.size();
		System.out.println("평균 : "+ avg);
		System.out.println("최대 : "+ max);
		System.out.println("최소 : "+ min);
		System.out.println("총합 : "+ sum);
	}

}
