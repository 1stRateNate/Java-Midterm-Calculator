import java.lang.Math;

/** Represents a calculation method.
 * 
 *@author Nathan Ashlock
 *@author nsa08a@acu.edu
 *@version 4.8
 *@since 4
 */

public class Operation {
	
	public double num1 = 0;
	public double num2 = 0;
	
	
	/** Method for the addition function
	 * @param num1 is the first number added
	 * @param num2
	 * @return a double value based on the user input.
	 */
	public double  addition (double num1,  double num2) {
		return (num1 + num2);
	}
	
	/** Method for the subtraction function.
	 * @param num1
	 * @param num2
	 * @return a double value based on the user input.
	 */
	public double subtraction(double num1, double num2) {
		return (num1 - num2);
	}
	
	/** Method for the multiplication function.
	 * @param num1
	 * @param num2
	 * @return a double value based on the user input.
	 */
	double multiplication(double num1, double num2) {
		return (num1 * num2);
	}
	
	/** Method for the division function.
	 * @param num1
	 * @param num2
	 * @return a double value based on the user input.
	 */
	double division(double num1, double num2) {
		return (num1 / num2);
	}
	
	/** Method for the modulo division function.
	 * @param num1
	 * @param num2
	 * @return a double value based on the user input.
	 */
	double modulo(double num1, double num2) {
		return (num1 % num2);
	}
	
	/** Method for the exponentiation function.
	 * @param num1
	 * @param num2
	 * @return a double value based on the user input.
	 */
	double power(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	/** Method for the square root function.
	 * @param num1
	 * @return a double value based on the user input.
	 */
	double squareRoot(double num1) {
		return Math.sqrt(num1);
	}
		
	}
	 
	