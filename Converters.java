/*Converter class that contains contains methods to calculate conversions and includes
 * the method 'converter' which takes the values inputed in the main method and makes all necessary calculations
 * and gives the user the final result
 */


public class Converters {
	

public static void converter(double temp, int type, int type2) { //takes the values inputed in the main method and makes all necessary calculations 
																//and gives the user the final result
		
		//Values inputed by user from 1-3 are taken and specified as the original and metric to convert to
		int original_metric = type;
		int converted_metric = type2;
		
		if(original_metric == 1) {			//Farenheit calculations
			
			if (converted_metric == 1) {	//Used if user inputs the same temperature metric
				System.out.println("The temperature " + temp + "F remains the same.");
			}
			else if (converted_metric == 2) {
				System.out.println("The temperature " + temp + "F is converted to " + F_to_C(temp) + "C.");
			}
			else if (converted_metric == 3) {
				System.out.println("The temperature " + temp + "F is converted to " + F_to_K(temp) + "K.");
			}
		}
		
		else if(original_metric == 2) {		//Celsius calculations
			
			if (converted_metric == 1) {
				System.out.println("The temperature " + temp + "C is converted to " + C_to_F(temp) + "F.");
			}
			else if(converted_metric == 2) {	//Used if user inputs the same temperature metric
				System.out.println("The temperature " + temp + "C remains the same.");
			}
			else if (converted_metric == 3) {
				System.out.println("The temperature " + temp + "C is converted to " + C_to_K(temp) + "K.");
			}
		}
		
		else if(original_metric == 3) {		//Kelvin calculations
			
			if (converted_metric == 1) {
				System.out.println("The temperature " + temp + "K is converted to " + K_to_F(temp) + "F.");
			}
			else if(converted_metric == 2) {	
				System.out.println("The temperature " + temp + "K is converted to " + K_to_C(temp) + "C.");
			}
			else if (converted_metric == 3) {	//Used if user inputs the same temperature metric
				System.out.println("The temperature " + temp + "K remains the same.");
			}
		}
		
	} //END OF CONVERTER METHOD

	//Methods used to convert from one metric to another; all are used in 'converter' method
	private static double F_to_C(double num) {
		double newTemp = (num - 32)*(5/9);
		return newTemp;
	}
	
	private static double F_to_K(double num) {
		double newTemp = ((num - 32)*(5/9)) + 273.15;
		return newTemp;
	}
	
	private static double C_to_F(double num) {
		double newTemp = (num*(9/5)) + 32;
		return newTemp;
	}
	
	private static double C_to_K(double num) {
		double newTemp = num + 273.15;
		return newTemp;
	}
	
	private static double K_to_F(double num) {
		double newTemp = (num - 273.15)*(9/5) + 32;
		return newTemp;
	}
	
	private static double K_to_C(double num) {
		double newTemp = num - 273.15;
		return newTemp;
	}

}
