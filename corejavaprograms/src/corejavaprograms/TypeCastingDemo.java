package corejavaprograms;

public class TypeCastingDemo {

	public static void main(String[] args) {

		// Implicit Type Casting
		// Smaller data type convert into larger data type

		int myInt = 100;

		double myDouble = myInt; // Automatic casting from int to double

		System.out.println("myInt  : " + myInt);
		System.out.println("myDouble   : " + myDouble);

		// Explicity Type Casting (narrowing)

		// Larger data type convert into smaller data type

		double anotherDouble = 3.14;

		int anotherInt = (int) anotherDouble;

		System.out.println("anotherDouble  : " + anotherDouble);
		System.out.println("anotherInt   : " + anotherInt);

	}

}
