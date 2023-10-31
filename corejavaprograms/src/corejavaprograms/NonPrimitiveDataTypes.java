package corejavaprograms;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		String[] names = {"Alice", "Bob", "Charlie"};
		
		System.out.print("Numbers");
		
		for(int number : numbers) {
			
			System.out.print(number + "---");
		}
		
		System.out.println();
		
		System.out.print("Names:");
		
		for(String name : names) {
			
			System.out.print(name + "---");
		}
		
		System.out.println();

	}

}
