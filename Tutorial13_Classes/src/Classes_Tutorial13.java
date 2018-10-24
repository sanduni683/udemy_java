
public class Classes_Tutorial13 {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();

		person1.name = "Sanduni";
		person1.age = 27;

		person2.name = "Dimuthu";
		person2.age = 37;

		System.out.println(person1.name);
		person1.speak();
		System.out.println(person2.name + person2.age);
		person2.myDetails();

		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();

		System.out.println(fruit1.name);
		System.out.println(fruit1.amount);
		fruit1.fruitDetails();

		fruit1.amount = 30;
		System.out.println(fruit1.amount);
		fruit1.fruitDetails();

	}
}

// classes are blueprints to made objects, they made objects of same type(class)
// for a package there can be only one public class , because public class should have the class name and this name cannot be repeated , therefore only one public for a package.
// Except public there can be more classes.
class Person{ //this class is a default class
	//classes can contain : 
	
	// 1.data (instances or variables)
	String name;
	int age;
	
	//2. subroutines (methods)
	void speak(){
		System.out.println("Hello I can speak");
	}
	public void myDetails(){
		System.out.println("My name is "+ name + " and I'm "+ age + " years old.");
	}
}

class Fruit{
	String name = "Apple";
	int amount;
	String color;

	protected void  fruitDetails(){
		for(int i=0; i< 3; i++){
			System.out.println("Fruit "+ name + " has "+ amount+ name);
		}
	}
}