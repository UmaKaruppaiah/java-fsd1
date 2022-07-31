package AssistedPractice;

import java.util.Scanner;

public class Narrowing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		System.out.println("After narrowing or explicit type conversion values are: ");
        System.out.println("Double value: "+d); 
        System.out.println("Float value: "+f);
        System.out.println("Long value: "+l);
        System.out.println("Int value: "+i);  
	}

}
