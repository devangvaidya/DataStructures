package HashTable;

public class Student {
	private String name;
	private String rollno;
	public Student(String name, String rollno, String cgpa) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", cgpa=" + cgpa + "]";
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	private String cgpa;
	
}
