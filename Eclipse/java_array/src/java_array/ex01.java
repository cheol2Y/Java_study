package java_array;

public class ex01 {
	public static void main(String[] args) {
		// arr mandle a boza
		
		String[] arr1 = {"Kloud", "Cass", "Asahi", "Guinness", "Heineken"};
		System.out.println(arr1[0]);
		System.out.println(arr1.length);
		
		String x = "Kozel";
		arr1[0] = x;
		System.out.println(arr1[0]);
		
		int y = arr1.length -1 ;
		System.out.println(arr1[y]);
		System.out.println("=============");
		for (int i=0; i < arr1.length; i++) {
			  System.out.println(arr1[i]);
			}
	}

}
