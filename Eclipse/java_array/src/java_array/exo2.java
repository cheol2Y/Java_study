package java_array;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해위
		int[] score = new int[5]; // 크기가 3인 배열 생성
		score[0] = 10; // 0번 index에 값 할당
		score[1] = 15; // 1번 index에 값 할당
		score[2] = 13; // 2번 index에 값 할당
		score[3] = 20;
		score[4] = 30;
		int sum = 0 ;
		int max = 0;
		for (int i = 0; i< score.length; i++) {
			sum += score[i];
			System.out.println(sum);
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		double avg = (double)sum / score.length;
		System.out.println("점수 합계 : " + sum);
		System.out.println("점수 평균 : " + avg);
		System.out.println("점수 최고 : " + max);
	}

}
