package Try_catch;

public class TryCatch_Final {
	public static void main(String[] args) {
		try {
			int data = 50-30;
			System.out.println(data);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally Block");
			System.out.println("No Exception occur");
		}
		System.out.println("tne code is executed....");
	}
	

}
