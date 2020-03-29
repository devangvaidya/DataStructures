package Stack;

public class PersonStack {
	
	private Person[] stack;
	private int top;
	private int size;
	
	public PersonStack(){
		top = -1;
		size = 50;
		stack = new Person[size];
	}
	public PersonStack( int size) {
		top = -1;
		this.size = 50;
		stack = new Person[this.size];
	}
	
	public Person pop() {
		return stack[top--];
	}
	
	public boolean push(Person item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			return false;
		}
		
		top++;
		stack[top] = item;
		return true;
	}
	
	public boolean isFull() {
		return (top == stack.length -1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	


}
