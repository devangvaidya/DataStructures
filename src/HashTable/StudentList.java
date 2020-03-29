package HashTable;

public class StudentList {
	Node head;
	public StudentList(Student s) {
		// TODO Auto-generated constructor stub
		head = new Node(s);
		
	}
	
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		Node n = new Node(s);
		n.next = head.next;
		head.next = n;
		return true;
	}
	
	public boolean haveRollNo(String rollno) {
		Node n = head.next;
		boolean have = false;
		
		while(n != null) {
			if(rollno.equals(n.student.getRollno())) {
				have = true;
			}
			n = n.next;
		}
		
		return have;
	}
	
	public Student fetchData(String rollno) {
		Student data = null;
		Node p = head.next;
		while(p != null) {
			if(p.student.getRollno().equals(rollno)) {
				data = p.student;
				break;
			}
			p = p.next;
		}
		return data;
	}
	
	public void deleteStudent(String rollno) {
		// TODO Auto-generated method stub
		Node p = head;
		Node q = head.next;
		while(q!=null && !(q.student.getRollno().equals(rollno))) {
			p = q;
			q = q.next;
		}
		if(q != null) {
			p.next = q.next;
		}else {
			// no data
		}
		
		
	}
	
	public void showAll() {
		// TODO Auto-generated method stub
		Node x = head.next;
		while(x != null) {
			System.out.println(x.student);
			x = x.next;
		}
	}
	
	class Node{
		private Student student;
		private Node next;
		
		public Node(Student data) {
			// TODO Auto-generated constructor stub
			student = data;
			next = null;
		}
	}

}
