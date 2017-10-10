package 자료처리;

import java.util.Scanner;

public class Main1697 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int n = scan.nextInt();
		Que q = new Que(n);
		
		while(n>0){
			String str = scan.next();
			if(str.equals("i")){
				int m = scan.nextInt();
				q.push(m);
			}else if(str.equals("o")){
				if(q.isEmpty()) {
					System.out.println("empty");
					continue;
				}
				System.out.println(q.peek());
				q.pop();
				
			}else if(str.equals("c")){
				System.out.println(q.getNum());
			}
		}
		
		
	}

}


class Que{
	int top = - 1;
	int bottom = -1;
	int maxSize ;
	int[] arr = new int[110];
	
	Que(int n){
		maxSize= n;
	}
	
	void push(int m){
		arr[++top] = m;
	}
	
	int getNum(){
		return top-bottom;
	}
	
	int peek(){
		return arr[bottom +1];
	}
	
	void pop(){
		bottom++;
	}
	
	boolean isEmpty(){
		return ( top == bottom);
	}
	
}
