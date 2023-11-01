package polymorphismpackage;

class Calculator {

	int sum(int a, int b) {

		return a + b;
	}
}

class AdvanceCalculator extends Calculator {

	@Override
	int sum(int a, int b) {

		return a + b;
	}

	int sum(int a, int b, int c) {

		return a + b + c;
	}

	public static void main(String[] args) {

		Calculator basicCal = new Calculator();
		AdvanceCalculator advCalc = new AdvanceCalculator();

		int result1 = basicCal.sum(5, 7);
		int result2 = advCalc.sum(5, 3, 2); // Overloads the method
		int result3 = advCalc.sum(10, 20);// Overrides the method

		System.out.println("Basic calculator Result : " + result1);
		System.out.println("Advance calculator Result : " + result2);
		System.out.println(result3);

	}

}
