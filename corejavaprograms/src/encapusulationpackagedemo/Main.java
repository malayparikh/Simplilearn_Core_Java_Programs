package encapusulationpackagedemo;

class Student {

	// Private fields (data members)

	private String name;
	private int age;

//Constructor

	public Student(String name, int age) {

		this.name = name;
		this.age = age;
	}

//Getter method for name

	public String getName() {

		return name;
	}

//Setter method for name

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {

		return age;
	}

//Setter method for age

	public void setAge(int age) {

		this.age = age;
	}

}

public class Main {

	public static void main(String[] args) {

		// create a Student Object

		Student student = new Student("Jerry", 20);

		System.out.println("Student Name : " + student.getName());
		System.out.println("Student Age : " + student.getAge());

		student.setName("Farhan");
		student.setAge(22);

		System.out.println("Updated Student Name : " + student.getName());
		System.out.println("Updated Student Age : " + student.getAge());

	}

}
