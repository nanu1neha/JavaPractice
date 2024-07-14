package oopsConcepts;

public class Animal {
//Implementing attributes in java
static String planet;
String name;
String color;
boolean canFly;

} 

class AnimalDemo{
	public static void main(String[] args) {
		Animal cat=new Animal();
		Animal dog=new Animal();
		
		cat.name="Fluffy";
		dog.name="Pluto";
		System.out.println(cat.name);
		System.out.println(dog.name);
		cat.planet="Earth";
		System.out.println(cat.planet);
		System.out.println(dog.planet);
		dog.planet="Mars";
		System.out.println(cat.planet);
		System.out.println(dog.planet);
	}
}
