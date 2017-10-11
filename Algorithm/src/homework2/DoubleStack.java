package homework2;

public class DoubleStack {
	private final int SIZE = 100;
	private int top;
	private double[] items;
	
	public DoubleStack(){
		top = -1;
		items = new double[SIZE];
	}
	
	public boolean isFull(){
		return top == SIZE -1 ;
		
	}
	
	public boolean isEmpty(){
		return top == -1 ;
	}
	
	public double peak(){
		if(isEmpty()) System.exit(1);
		return items[top];
	}
	
	public void push(double item){
		if(isFull()) System.exit(1);
		items[++top] = item;
	}
	
	public void pop(){
		if(isEmpty()) System.exit(1);
		--top;
	}
	
}
