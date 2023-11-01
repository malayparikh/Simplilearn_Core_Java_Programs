package exceptionHandling;

public class FinallyBlockExample {

	public static void main(String[] args) {

		try {

			int result = divide(20, 0);
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {

			System.out.println("An error occured : " + e.getMessage());
		} finally {

			System.out.println(
					"Finally block is used to ensure that a block of code is always excuted whether an exception is thrown or not");
		}

	}

	public static int divide(int numr, int deno) {

		if (deno == 0) {

			throw new ArithmeticException("Division by zero not allowed..");
		}

		return numr / deno;
	}

}
