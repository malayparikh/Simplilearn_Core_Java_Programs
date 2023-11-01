package inheritancedemo;


class Employee{
	
	float salary = 40000;
}

public class Programmer extends Employee {
	
	int bonus = 10000;
	
	public static void main(String args[]) {
		
		Programmer prog = new Programmer();
		
		System.out.println("Programmer salary is : " + prog.salary);
		System.out.println("Programmer bonus is : " + prog.bonus);
	}

}
