package java_class_study;

public class ex01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("BMW", "RED", 4);
		System.out.println();
		car1.startEngine();
		car2.unused_private();
	}

}
