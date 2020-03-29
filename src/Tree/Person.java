package Tree;

public class Person {
	private String name;
	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
