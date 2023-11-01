package inheritancedemo;

class Parent {

	public static void main(String[] args) {

		Child child = new Child();

		child.displayParent();
		child.displayChild();
	}
}

class Base {

	void displayParent() {

		System.out.println("This is the Parent class");
	}

}

class Child extends Base {

	void displayChild() {

		System.out.println("This is the Child class");
	}

}
