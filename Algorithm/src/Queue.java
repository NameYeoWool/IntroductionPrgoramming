
public class Queue {

	private final int Size =100;
	private int front , rear;
	private int[] items;
	
	public Queue(){
		items = new int[Size];
		front = rear = 0;
	}
	public boolean isFull(){
		return front == (rear+1)%Size;
	}
	public boolean isEmpty(){
		return front == rear;
	}
	public int peak(){
		if(isEmpty()) System.exit(1);
		return items[front];
	}
	public void enqueue(int item){
		if(isFull()) System.exit(1);
		items[rear]=item;
		rear = (rear+1)%Size;
	}
	public void dequeue(){
		if(isEmpty()) System.exit(1);
		front = (front+1)%Size;
	}
	
}
