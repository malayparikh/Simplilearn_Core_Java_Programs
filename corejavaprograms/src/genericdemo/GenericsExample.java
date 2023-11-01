package genericdemo;
public class GenericsExample {
    public static void main(String[] args) {
        // Creating a generic class instance with Integer type parameter
        Box<Integer> integerBox = new Box<>();
        integerBox.set(42);

        // Creating a generic class instance with String type parameter
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");

        // Getting and printing values
        Integer intValue = integerBox.get();
        String stringValue = stringBox.get();

        System.out.println("Integer Value: " + intValue);
        System.out.println("String Value: " + stringValue);
    }
}

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

