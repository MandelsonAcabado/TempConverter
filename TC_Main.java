/*Mandelson Acabado
 *Start Date: March 1st 2022
 *Program Purpose:
 *	A very simple temperature converter program that takes user input and allows
 *	user to choose whether the inputed temperature is of Farenheit, Celsius, or Kelvin
 *	and convert the temperature to any of the other two metrics.
 */

import java.util.Scanner;
public class TC_Main {
	
	static double temp;	//User inputed temperature
	static int type1;	//User starting temperature metric
	static int type2;	//User metric to convert to

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		boolean status = true;
		
		//Do-while loop ensures invalid inputs do not cause errors and terminate program
		
		do {	//Loop to take input for number of degrees
			System.out.println("Enter degree: ");
			
			if(kb.hasNextDouble()) {	//ensures that user input is of the correct type
				
				temp = kb.nextDouble();
				status = false; 		//ends current do-while loop
			}
			
			else {
				System.out.println("Invalid input. Please enter a valid number.");
				kb.nextLine();	//Advances the scanner to prevent input errors
			}
			
		} while(status); 
		
		kb.nextLine();	//Advances the scanner to prevent input errors
		status = true;	//reset status for future do-while loops
		
		do {	//loop to take input on what the original metric is
			System.out.println("\nEnter '1', '2,' or '3' if the degree is in Farenheit, Celsius, or Kelvin respectively:");
			
			if(kb.hasNextInt()) {
				type1 = kb.nextInt();
				if(type1 == 1 || type1 == 2 || type1 == 3) {
					status = false;
				}
				else {
					System.out.println("Invalid input. Please enter a valid number.");
					kb.nextLine();
				}
			}
			
			else {
				System.out.println("Invalid input. Please enter a valid number.");
				kb.nextLine();
			}
		} while(status);
		
		kb.nextLine();
		status = true;
		
		do {	//loop to take input on which metric to convert to
			System.out.println("\nEnter '1', '2,' or '3' if you are converting to Farenheit, Celsius, or Kelvin respectively:");
			
			if(kb.hasNextInt()) {
				type2 = kb.nextInt();
				if(type2 == 1 || type2 == 2 || type2 == 3) {
					status = false;
				}
				else {
					System.out.println("Invalid input. Please enter a valid number.");
					kb.nextLine();
				}
			}
			
			else {
				System.out.println("Invalid input. Please enter a valid number.");
				kb.nextLine();
			}
		} while(status);
		
		kb.close();
		Converters.converter(temp, type1, type2);	//returns final result
		
	}//END OF MAIN METHOD

}//END OF MAIN CLASS
