package java_class_study;

public class exception2 {
	public void shouldBeRun() {
		System.out.println("ok thanks");
	}
	public static void main(String[] args) {

		exception2 sample = new exception2();
    int c;
    try {
      c = 4 / 0;
    } catch (ArithmeticException e) {
      c = -1;
    } finally {
      sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
    }
  }}
