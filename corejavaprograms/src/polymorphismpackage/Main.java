package polymorphismpackage;

//Abstract class

abstract class Shape { // Abstract class

	abstract void draw(); // Abstract Method
}

class Circle extends Shape {

	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");

	}

}

public class Main {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape rect = new Rectangle();

		circle.draw();
		rect.draw();
	}

}
