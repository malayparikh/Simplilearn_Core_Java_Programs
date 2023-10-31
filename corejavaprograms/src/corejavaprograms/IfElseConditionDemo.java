package corejavaprograms;

public class IfElseConditionDemo {

	public static void main(String[] args) {
		
		String title = "Simplilearn online course";
		
		//contain() method
		// this method will check if your expected string has desired set of characters or not
		// This method is return a boolean output 
		// Title of the page : "Simplilearn" should be on first place OR at least it should be present
		
		boolean result = title.contains("Simplilearn111111");
		
		System.out.println(result);
		
		if(result) {
			
			System.out.println("Title is valid. Test case Pass!");
		}
		else {
			
			System.out.println("Title is not valid. Test case Failed !");
		}
		
		
		
		

	}

}
