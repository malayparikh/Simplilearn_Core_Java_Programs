package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a list to store integers
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Access elements by index
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);

        // Print the elements
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Iterate over the list and print all elements
        System.out.println("All Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
