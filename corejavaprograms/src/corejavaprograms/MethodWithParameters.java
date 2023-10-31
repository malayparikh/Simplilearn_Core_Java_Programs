package corejavaprograms;

public class MethodWithParameters {   //Declared the class

	// A user-defined method to calculate the sum of two number

	 static int multiplication(int a, int b) {  // Declare your method-1

		return a * b;
	}

	static void printMessage(String message) { // // Declare your method-2

		System.out.println(" Your Message : " + message);
	}

	public static void main(String[] args) {    // main method

		int num1 = 100;    // Defined some variable 
		int num2 = 5;

		// Call the sum method to calculate the sum of num1 and numb2

		int mulitplication_result = multiplication(num1, num2);

		System.out.println("Multiplication of num1 and num2 is : " + mulitplication_result);

		printMessage("Method for print the message");

	}

}
