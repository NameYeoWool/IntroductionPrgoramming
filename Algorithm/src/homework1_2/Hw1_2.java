package homework1_2;

public class Hw1_2 {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		int k=1;
		for(int i = 0 ; i < 4 ; i ++){
			Grade g = new Grade();
			System.out.printf("Grade"
					+ " %1d의 kor,end,math"
					+ " 값을 입력하시요\n",k++);
			
			g.set();
			stack.push(g);
		}
		
		for(int i = 0 ; i < 3; i ++){
			Grade s = stack.peek();
			System.out.print(s+" ");
			System.out.print(s.kor+" ");
			System.out.print(s.eng+" ");
			System.out.print(s.math+" ");
			stack.pop();
			System.out.println();
		}
		System.out.println("end");
	}

}
