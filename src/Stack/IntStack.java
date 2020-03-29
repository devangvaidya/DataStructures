package Stack;

public class IntStack {
	
	private int[] stack;
	private int top;
	private int size;
	
	public IntStack(){
		top = -1;
		size = 50;
		stack = new int[size];
	}
	public IntStack( int size) {
		top = -1;
		this.size = 50;
		stack = new int[this.size];
	}
	
	public int pop() {
		return stack[top--];
	}
	
	public boolean push(int item) {
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
