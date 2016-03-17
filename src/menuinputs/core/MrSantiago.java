package menuinputs.core;

import java.util.Scanner;
public class MrSantiago {
	public static void main(String args[]){
		// Declarations
		Scanner in = new Scanner(System.in);
		int integer;
		long longInteger;
		float realNumber;
		double doubleReal;
		String string1;
		String string2;
		// Read in values
		System.out.println("Enter an integer");
		integer = in.nextInt();
		System.out.println("Enter in a long number");
		longInteger = in.nextLong();
		System.out.println("Enter in a floating number");
		realNumber = in.nextFloat();
		System.out.println("Enter in a double");
		doubleReal = in.nextDouble();
		System.out.println("Enter in a String");
		string1 = in.nextLine();
		System.out.println("Enter in a String.");
		string2 = in.next();
		System.out.println("Here is what you entered: ");
		System.out.println(integer + " " + longInteger + " " +
		realNumber +" " + doubleReal + " " +
		string1 + " and " + string2);
	}//end of main
}//end of class