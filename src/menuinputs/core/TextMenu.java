package menuinputs.core;

import java.util.Scanner;

public class TextMenu {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException{
		int firstinput;
		
		System.out.println("Select 1 or 2");
		firstinput = input.nextInt();
		
		if(firstinput <= 2){
			if(firstinput == 1){
				System.out.println("You picked option 1");
			}else{
				System.out.println("You picked option 2");
			}
		}else{
			System.out.println("You picked: " + firstinput + " that is not an option!");
		}
	}
}