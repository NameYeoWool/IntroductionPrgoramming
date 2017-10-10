package homework1_2;

public class Stack {
	
	final int SIZE= 100;
	private int top;
	private Grade[] items;
	
	public Stack(){
		top = -1;
		items = new Grade[SIZE];
	}
	public boolean isFull(){
		return top == SIZE-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	public Grade peek(){
		if(isEmpty()) System.exit(1);
		return items[top];
	}
	public void push(Grade item){
		if(isFull()) System.exit(1);
		items[++top] = item;
	}
	public void pop(){
		if(isEmpty()) System.exit(1);
		--top;
	}

}


