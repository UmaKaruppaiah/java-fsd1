package Exceptionhandling;

	public class WaitSleep {
		private static Object Lock=new Object();
		public static void main(String[] args) throws InterruptedException{
			Thread.sleep(100);;
			System.out.println("Thread"+ Thread.currentThread().getName());
			synchronized(Lock){
				Lock.wait(100);
				System.out.println(Lock);
			}
		}
}
