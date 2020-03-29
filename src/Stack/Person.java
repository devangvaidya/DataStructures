package Stack;

public class Person {
	private String name;
	private String rollno;
	
	public Person (String name, String rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", rollno=" + rollno + "]";
	}
}
