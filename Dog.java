package experiment;

public class Dog {
 String name;
 String breed;
public Dog(String name ,String breed) {
	this.name=name;
	this.breed=breed;
}
public void display() {
	System.out.println(name);
	System.out.println(breed);
}
public static void main (String [] args) {
	Dog d= new Dog("max","labrador");
	d.display();
	Dog d1= new Dog("tucker","golden retriever");
	d1.display();
}
}