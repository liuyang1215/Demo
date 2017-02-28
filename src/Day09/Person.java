package Day09;

public class Person {
	String name = "";
	
	Person() {
		this("");
	}
	
	public Person(String name) {
		this.name = name;
	}
}

class Employee extends Person {
	String empNO = "0000";
	
	Employee() {
		this("");
	}
	
	public Employee(String empNO) {
		this.empNO = empNO;
	}
}