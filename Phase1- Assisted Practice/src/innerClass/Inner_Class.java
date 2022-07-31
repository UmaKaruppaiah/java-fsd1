package innerClass;

 class InnerClass {
	int num;
	private class Inner{
		public void print() {
			System.out.println("Inner Class");
		}
	}
	void INner(){
		Inner inner = new Inner();
		inner.print();
		
	}

}
public class Inner_Class{
	public static void main(String[] args) {
		InnerClass a= new InnerClass();
		a.INner();
	}
	
}
