package oops;

public class Inheritance {
	public static void main(String[] args) {
		Bclass b = new Bclass();
		b.showme();
	}
}
class Aclass{
	int num=20;
	void display() {
		System.out.println("Hellow EveryOne");
	}
}
class Bclass extends Aclass{
	int num=80;
	void display() {
		System.out.println("Hellow, world");
	}
	void showme() {
		int num=60;
		System.out.println(num);//local 
		System.out.println(this.num);//instance of sub class
		System.out.println(super.num);//instance of super class
		display();
		super.display();
	}
}
