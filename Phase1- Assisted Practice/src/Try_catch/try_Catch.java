package Try_catch;

public class try_Catch {
	public static void main(String[] args) {
		System.out.println("TRY CATICH - EXCEPTION HANDLING");
		try {
			try {
				int a=20/0;
			}catch(Exception e) {
				System.out.println(e);
			}
			int value[]= {2,7,4,0,4};
			value[8]=24;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("FINAL VALUE");
				
	}

}
