package homework2;

public class Stack {
	private final int SIZE = 100;
	private int top;
	private char[] items;
	
	public Stack(){
		top = -1;
		items = new char[SIZE];
	}
	
	public boolean isFull(){
		return top == SIZE -1 ;
		
	}
	
	public boolean isEmpty(){
		return top == -1 ;
	}
	
	public char peak(){
		if(isEmpty()) System.exit(1);
		return items[top];
	}
	
	public void push(char item){
		if(isFull()) System.exit(1);
		items[++top] = item;
	}
	
	public void pop(){
		if(isEmpty()) System.exit(1);
		--top;
	}
	
}
