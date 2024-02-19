package java_class_study;

public class ex02 {
	public static void main(String[] args) {
		teemo teemo1 = new teemo();
		shark shark1 = new shark();
		eagle eagle1 = new eagle();
		peacock peacock1 = new peacock();
		
		shark1.king_fish();
		shark1.lay_egg();
		shark1.caviar();
		shark1.eat();
		System.out.println("=======================\n");
		
		eagle1.bold();
		eagle1.fly();
		eagle1.king_bird();
		System.out.println("=======================\n");
		
		peacock1.flirting();
		peacock1.fly();
		System.out.println("=======================\n");
		
		teemo1.lay_egg();
		teemo1.find_teemo();
		teemo1.hide_teemo();
		teemo1.captain_teemo();

	}
}
