package java_tutorial;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string 문자열
		String str  ="Hellow World";
		System.out.println(str);
		str = "Hi~";
		System.out.println(str);
		str= "100";
		
		// str을 int로 변환
		int x = Integer.parseInt(str);
		System.out.println("int:"+x);
		
		// str을 long으로
		long y = Long.parseLong(str);
		System.out.println(y);
		
		double z = Double.parseDouble(str);
		System.out.println(z);
		
		String str1 =String.valueOf(x);
		String str2 = String.valueOf(y);
		System.out.println(str1.getClass().getTypeName());
		System.out.println(str2.getClass().getTypeName());
	}

}
