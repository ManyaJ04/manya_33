package experiment;

public class Person {
	 String name;
	 int age;
	public Person(String name ,int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main (String [] args) {
		Person p= new Person("manya",19);
		p.display();
	}
	}
