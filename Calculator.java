import java.util.Scanner;
import java.lang.Math;

/** Gets a calculation based on user input.
 * @author Nathan Ashlock
 * @author nsa08a@acu.edu
 *version 4.8
 *since 4
 */
public class Calculator {

	static String numberOne = "";
	static String numberTwo = "";
	static String operator = "";
	static double firstNumber = 0;
	static double secondNumber = 0;
	static char operator1 = 0;
	static String choice = "Y";
	
	
	public static void main(String[] args) {
		
		// A new Operation object called "calculate" which will call the relevant mathematical function from the public class Operation to execute the program.
		Operation calculate = new Operation();
		
		// A new Calculator object named "calculator" which allows the program to call in the converted double values inputed by the user into the main method to be used in the equation.
	//	Calculator calculator = new Calculator();
		
		// A new Scanner object to get user input.
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.printf("Welcome to my calculater! Math is so fun. Let's do some calculations together ;D%n");
		System.out.println("This calculator can support addition (+), subtraction (-), multiplication (*) division (/), modulo division (%), exponentiation (^), and square root (?)");		
		
		//A simple while loop that will start the program over if the user inputs "y" when prompted to continue. Will exit if user inputs "n".
		while (choice.equalsIgnoreCase("Y")) {
			
			//a try statement that will attempt to run through the program if user input is acceptable.
			//We have a catch statement later that will catch exceptions.
			try {
				
				/*This block of code contains the first usage of the scanner userInput to get the user's first number.
				 *In order to allow the user to simply input "pi" and "e" into the scanner and for the program execute their Math methods, this block contains an if/else/if-else statement to check if user inputed "pi" or "e".
				 *The string is then converted to a double.
				 *The double value firstNumber is converted from String numberOne which the user inputs. Both Math.PI and Math.E supported.
				 */
				System.out.printf("%n%nEnter your first number: ");
					String numberOne = userInput.nextLine();
						numberOne = numberOne.toUpperCase().trim();
						if (numberOne.equals("PI")) {
							firstNumber = Math.PI;
					}	else if (numberOne.equals("E")) {
							firstNumber = Math.E;
					} 	else {
							firstNumber = Double.parseDouble(numberOne);
					}
				
				/*This block uses the scanner object userInput this time to get an operator from the user.
				 * The string is then converted to a char.
				 *Illegal operators are caught in a catch statement.
				 */
				System.out.printf("%nEnter your operator: ");
					String operator = userInput.nextLine();
					char operator1 = operator.charAt(0);
					
				/*This block of code executes the same function as the firstNumber block of code, except for the double value secondNumber this time.
				 * It contains the scanner object and an if/else-if/else statement to check for "pi" and "e" so Math.PI and Math.E can be used in calculations
				 * The string is converted to double secondNumber from String numberTwo which the user inputs.
				 */
				System.out.printf("%nEnter your second number: ");
					String numberTwo = userInput.nextLine();
					
					  if (numberTwo.contains("pi") || numberTwo.contains("PI") || numberTwo.contains("Pi")) {
							secondNumber = Math.PI;
					} else if (numberTwo.contains("e") || numberTwo.contains("E")) {
							secondNumber = Math.E;
					} else {
							secondNumber = Double.parseDouble(numberTwo);
					}
					
					  /*This if/else-if/else statement controls the flow of the program based on which operator the user inputs. 
					   *Depending on the inputted operator, one of the operations from Class Operation is called to calculate firstNumber and secondNumber.
					   */
					  
						if (operator1 == '+') {	
							System.out.println(calculate.addition(firstNumber, secondNumber));
						}
						else if (operator1 == '-') {
							System.out.println(calculate.subtraction(firstNumber, secondNumber));
						}
						else if (operator1 == '*') {
							System.out.println(calculate.multiplication(firstNumber, secondNumber));
						}
						else if (operator1 == '/') {
							System.out.println(calculate.division(firstNumber, secondNumber));
						}
						else if (operator1 == '%') {
							System.out.println(calculate.modulo(firstNumber, secondNumber));
						}
						else if (operator1 == '^') {
							System.out.println(calculate.power(firstNumber, secondNumber));
						}
						else if (operator1 == '?') {
							System.out.println(calculate.squareRoot(firstNumber));
						}
						else {
							System.out.println("Error! You entered an operator that cannot executed. Here are the operators that this program supports: +, -, *, /, %, ^, ?");
				}
						}
			
			//A catch statement that returns a message if an invalid number is inputted by the user.
			 catch (NumberFormatException ex) {
				System.out.println("That is not a valid number!");
			}
					//Executes the while loop from the beginning of the main method and allows the user to do another calculation if they wish to do so. Otherwise the program says goodbye and terminates.
					System.out.println();
					System.out.println("Would you like to start over? (Y/N): ");
					choice = userInput.nextLine();
			}
						//Closing the scanner
						userInput.close();
				
						//Farewell message if user enters "N" at the end of the while loop.
						System.out.println("See you next time!");
		}

}
