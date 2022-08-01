package oops;

public class ObjectClass {
	boolean lampOn;
	void turnOn() {
		lampOn=true;
		System.out.println("Light is On "+ "-" +lampOn);
	}
	public static void main(String[] args) {
		ObjectClass glow= new ObjectClass();
		glow.turnOn();
	}
}
