package AssistedPractice;

import java.util.Scanner;

public class Widening {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		long l = i;  
        float f = l;  
        double d= f;
        System.out.println("After widening or automatic type values are: ");
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
        System.out.println("Double value "+d); 
		
	}

}
