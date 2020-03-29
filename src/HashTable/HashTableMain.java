package HashTable;

public class HashTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hashTable = new HashTable();
		
		Student s1 = new Student("Dev", "10", "3");
		Student s2 = new Student("Ang", "11", "3.1");
		Student s3 = new Student("Vai", "12", "3");
		Student s4 = new Student("Via", "21", "3");
		
		hashTable.insert(hashTable.toHashCode(s1.getRollno()), s1);
		hashTable.insert(hashTable.toHashCode(s2.getRollno()), s2);
		hashTable.insert(hashTable.toHashCode(s3.getRollno()), s3);
		hashTable.insert(hashTable.toHashCode(s4.getRollno()), s4);
		
		hashTable.showData();
		
		//System.out.println(hashTable.fetchStdnfo("13"));
		System.out.println();
		hashTable.deleteStd("11");
		hashTable.showData();
	}

}
