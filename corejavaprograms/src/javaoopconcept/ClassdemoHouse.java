package javaoopconcept;

class House{
	
	String plan;
	String houseType;
	String pop;
}

public class ClassdemoHouse{
	
	public static void main(String[] args) {
		
		House myhouse = new House();
		
		myhouse.houseType = "Your house type is 3 BHK";
		
		System.out.println(myhouse.houseType);
	}
}