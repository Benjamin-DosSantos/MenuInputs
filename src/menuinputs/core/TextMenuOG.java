package menuinputs.core;

import java.util.Scanner;

public class TextMenuOG {
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Adding In Console
	 *	Project Description: This program 
	 *  is intended to ask the user for 
	 *  a choice of the numbers 1 or 2. 
	 *  If the user enters the value 0 
	 *  the program will end. Also if the 
	 *  user enters a number that is not 
	 *  0, 1, or 2 the program will also end.  
	 * 
	 **/
	
	static Scanner input = new Scanner(System.in);
	static int firstinput;
	public static void main(String[] arg){
		do{
			System.out.println("Select 1 or 2. Press 0 to stop");
			firstinput = input.nextInt();
			
			if(firstinput == 1){
				System.out.println("You picked option 1");
			}else if(firstinput == 2){
				System.out.println("You picked option 2");
			}else if(firstinput == 0){
				System.out.println("You have entered zero, the program has ended.");
			}
		}while(firstinput < 3 && firstinput != 0);
		
		if(firstinput >= 3){
			System.out.println("You picked: " + firstinput + " that is not an option!");
		}
	}
}
