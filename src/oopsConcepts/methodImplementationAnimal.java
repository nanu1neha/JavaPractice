package oopsConcepts;

public class methodImplementationAnimal {
	// ClassAtrribute
	static int count;
	// Instance Attribute
	String name;
	//Instance Methods
	void setName(String name) {
		this.name=name;
	}
	//Instance Methods
	String getName() {
		return name;
	}
	//Class Method
	void updateCount() {   
		count++;
		System.out.println(count);
	}
	
	
}
class methodImplementationAnimalDemo{
	public static void main(String[] args) {
		methodImplementationAnimal cat=new methodImplementationAnimal();
	cat.setName("Puffy");
	System.out.println(cat.getName());
	cat.updateCount();
	methodImplementationAnimal dog=new methodImplementationAnimal();
	dog.setName("Pluto");
	System.out.println(dog.getName());
	dog.updateCount();
	
	}
}
