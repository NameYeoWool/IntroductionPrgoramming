
public class Stack {
	private final int SIZE = 100;
	private int top;
	private int[] items;
	
	public Stack(){
		top = -1;
		items = new int[SIZE];
	}
	
	public boolean isFull(){
		return top == SIZE -1 ;
		
	}
	
	public boolean isEmpty(){
		return top == -1 ;
	}
	
	public int peak(){
		if(isEmpty()) System.exit(1);
		return items[top];
	}
	
	public void push(int item){
		if(isFull()) System.exit(1);
		items[++top] = item;
	}
	
	public void pop(){
		if(isEmpty()) System.exit(1);
		--top;
	}
	
}
