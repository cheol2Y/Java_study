package Java_map;
import java.util.Random;


public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
//		0~ 9까지의 랜덤
		int rand = random.nextInt(10);
//		1~10
		int rand1 = random.nextInt(10)+1;
		
		int rand2 = random.nextInt(20);
		
		String str = String.format("%d,%d, %d ",rand,rand1,rand2);
		System.out.println(str);
	}

}
