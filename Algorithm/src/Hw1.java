import java.util.Scanner;

public class Hw1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(palindrome(str));
	}
	
	
	public static boolean palindrome(String s){
		
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		for( int k = 0 ; k < s.length() ; k++){
			stack.push(s.charAt(k));
			queue.enqueue(s.charAt(k));
			
		}
		
		while(!queue.isEmpty()){
			if(stack.peak() == queue.peak()){
				stack.pop();
				queue.dequeue();
				
				if(queue.isEmpty()) System.out.println("is a palindrome");
			}else{
				return false;
			}
		}
		
		return true;
	}
}


