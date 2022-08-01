package oops;

public class abstractClass {
	public static void main(String[] args) {
		Bank b;
		b= new HDFC();
		System.out.println("HDFC Rate intrest is : "+b.getInterestRate()+"%");
		b=new KYC();
		System.out.println("KYC Rate intrest is : "+b.getInterestRate()+"%");
	}
	
}
abstract class Bank{
	abstract int getInterestRate();
}
class HDFC extends Bank{
	int getInterestRate() {
		return 10;
	}
}
class KYC extends Bank{
	int getInterestRate() {
		return 20;
	}
	
}