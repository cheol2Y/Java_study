package java_class_study;

public class exception {
	public static void main(String[] args) {

			    int a, b, c;
			    try {
			      a = 10;
			      b = 1;
			      c = a / b; // 10 나누기 0 → 산술오류 ArithmeticException
			    } catch (ArithmeticException e) {
			      c = -1;  // 예외가 발생하여 이 문장이 수행된다.
			    }
		System.out.println(c);	
	}

}
