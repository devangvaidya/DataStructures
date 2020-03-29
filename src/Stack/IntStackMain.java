package Stack;

public class IntStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStack intStack = new IntStack();
		
		if(!intStack.isFull()) {
			intStack.push(2);
			intStack.push(3);
			intStack.push(4);
		}
		
		System.out.println(intStack.pop() + " " + intStack.pop());
	}

}
