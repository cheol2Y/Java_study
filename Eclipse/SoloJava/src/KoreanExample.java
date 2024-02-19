
public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("윤성철","970805");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		k1.name = "파평윤씨";
		System.out.println(k1.name);
	}
}
