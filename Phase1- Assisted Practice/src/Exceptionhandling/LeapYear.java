package Exceptionhandling;

import javax.annotation.processing.FilerException;

public class LeapYear {
	public static void main(String[] args) throws FilerException{
		ThrowsThrow year=new ThrowsThrow();
		year.LeapYear(2000);
	}

}
