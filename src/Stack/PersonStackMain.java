package Stack;

public class PersonStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Devang", "7");
		Person p2 = new Person("Vaidya", "10");
		
		
		PersonStack personStack = new PersonStack();
		
		personStack.push(p1);
		personStack.push(p2);
		
		while(!personStack.isEmpty()) {
			System.out.println(personStack.pop());
		}
	}

}
