package java_class_study;



public class Car {
	// 속성(데이터)
	public String company;
	public String color;
	private int wheels;
	
	// 생성자(함수)
	public Car() {} 
	
	public Car(String company, String color, int wheels) {
		this.company= company;
		this.color = color;
		this.wheels = wheels;
	}
	
	public void startEngine() {
		System.out.println("부릉");
	}
	public int moveForward(int num) {
		int move_num = num * 10;
		System.out.println("앞으로 "+ move_num+"만큼 이동");
		return move_num;
	}
	
	private void openWindow() {
		System.out.println("창문을 열자");
	}
	public void unused_private() {
		System.out.println("바퀴수"+wheels);
		openWindow();
	}
	
	
	
	// 함수의 기능
}