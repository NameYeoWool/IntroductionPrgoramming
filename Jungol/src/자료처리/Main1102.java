package 자료처리;

import java.util.Scanner;

public class Main1102 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		Stack st = new Stack(n);
		
		
		while(n>0){
			String str = scan.next();
			if(str.equals("i")){
				int m = scan.nextInt();
				st.add(m);
				
			}else if(str.equals("c")){
				System.out.println(st.getNum());

			}else if(str.equals("o")){
			
				if(st.isEmpty()) {
					System.out.println("empty"); continue;
				}
				System.out.println(st.peek());
				st.pop();
			}
			n--;
		}
		

	}
}

class Stack {
	int top = -1;
	int MaxSize;
	int[] arr;

	Stack(int n) {
		MaxSize = n;
		arr = new int[n + 10];
	}
	
	void add(int m){
		arr[++top] = m; 
	}
	
	int getNum(){
		return top +1 ; 
	}
	

	int peek() {
		return arr[top];
	}
	
	void pop(){
		top--;
	}

	boolean isEmpty() {
		return (top == -1);
	}
	

}