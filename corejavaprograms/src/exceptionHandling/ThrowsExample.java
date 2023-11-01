package exceptionHandling;

public class ThrowsExample {

	public static void main(String[] args) {

		try {

			int result = divide(10, 0);
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {

			System.out.println("An error occured : " + e.getMessage());
		}

	}

	public static int divide(int numr, int deno) throws ArithmeticException {

		if (deno == 0) {

			throw new ArithmeticException("Division by zero is not allowed by throws method...");
		}

		return numr / deno;
	}

}
