package soheyon;

public class Stack {
	   
	   
    final char SIZE=100;
    private int top;
    private char[] items;
    
    
    public Stack(){
    top=-1;
    items=new char[SIZE];
    }
    
    public boolean isFull(){
       return top==SIZE-1;   
    }
    
    public boolean isEmpty(){
       return top==-1;
    }
    
    
    public void push(char item){
       if(isFull())
          System.exit(1);
       items[++top]=item;
    }
    public void pop(){
       if(isEmpty())
          System.exit(1);
       --top;
    }

    public char peak() {
       if(isEmpty())
          System.exit(1);
       return items[top];

       
    }
    
 }