package HashTable;

public class HashTable {
	
	private StudentList[] arr;
	private int size;
	private int totalStudents;
	
	public HashTable() {
		// TODO Auto-generated constructor stub
		size = 1000;
		arr = new StudentList[size];
	}
	
	
	public int toHashCode(String rollno) {
		int addascii = 0;
		int codevalue = 0;
		
		for(int i = 0; i < rollno.length() ; i++) {
			addascii += (int)rollno.charAt(i);
		}
		codevalue = addascii % arr.length;
		return codevalue;
	}
	
	public boolean insert(int key, Student data) {
		if(arr[key] == null) {
			arr[key] = new StudentList(data);
		}
		
		arr[key].insertStudent(data);
		totalStudents++;
		return true;
	}
	
	public int getTotalStudents() {
		return totalStudents;
	}
	
	public Student fetchStdnfo(String rollno) {
		int key = toHashCode(rollno);
		if(arr[key] == null) {
			return null;
		}else {
			Student q = arr[key].fetchData(rollno);
			if(q != null) {
				return q;
			}else {
				return null;
			}
		}
	}
	
	public boolean deleteStd(String rollno) {
		boolean have = arr[toHashCode(rollno)].haveRollNo(rollno);
		if(have) {
			int key = toHashCode(rollno);
			arr[key].deleteStudent(rollno);
			totalStudents--;
			return true;
		}
		return false;
	}
	
	public void showData() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != null ) {
				arr[i].showAll();
			}
		}
	}
	
}
