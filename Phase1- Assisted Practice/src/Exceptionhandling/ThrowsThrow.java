package Exceptionhandling;

import javax.annotation.processing.FilerException;

public class ThrowsThrow {
	public void LeapYear(int year)throws FilerException {
		//int year=0;
		if(year%4==0) {
			System.out.println("Leap Year");
		}else {
			throw new FilerException("Not a Leap Year");
		}
	}

	
		
	

}
