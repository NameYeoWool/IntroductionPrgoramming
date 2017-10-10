package homework2;

import java.util.Scanner;

public class Infix {
	static int[] arr = new int[110];
	static char[] priority = { '~','*','/','+'};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		
		String post = toPostfix(str1);
		calculation(post);
		
		
	}//end main
	
	public static void calculation(String post){
		
	}//end calculation
	
	public static String toPostfix(String str1){
		Stack operators = new Stack();
		
		String post = "";
		char ch;
		
		for(int i = 0 ; i < str1.length(); i++){
			//��ȣ ó��
			if(str1.charAt(i)=='('){
				ch = str1.charAt(i);
				operators.push(ch);
				
			//��ȣ ó��
			}else if(str1.charAt(i)==')'){
				// pop until '(' is out
				while(true){
					ch = operators.peak();
					operators.pop();
					// '('�� ������ while �� break; - '(' ��� �ȵǰ�
					if(ch == '(') break;
					post += Character.toString(ch);
					//System.out.print(ch);
					
					
					
				}
			// ��ȯ
			}else{
				ch = str1.charAt(i);
				//���ڰ� �ƴ� �����ڴ� ���ÿ� �ױ�
				if(ch>'9' || ch <'0'){
					//�켱 ���� �� - ������� �ٷ� ���� �ִ´�.
					if(operators.isEmpty()) {
						operators.push(ch);
						continue;
					//������� ���� ���
					}else{
						char op = operators.peak();

						//���� ���� �������� �켱������ ���� ���
						if(check(ch,op)){
							operators.push(ch);
							
						//���� ���� �������� �켱������ ���� ���
						}else{
							operators.pop();
							operators.push(ch);
							post += Character.toString(ch);
							//System.out.print(op);
						}
						
					}
					
				//���ڴ� ���
				}else{
					post += Character.toString(ch);
					//int n = ch-'0';// ���ڸ� ���ڷ� ��ȯ
					//System.out.print(n);
				}
			}
			
		}
		
		
		char ope;
		
		//���� �ִ� ������ ���
		while(true){
			if(operators.isEmpty()) break;
			ope = operators.peak();
			operators.pop();
			post += Character.toString(ope);
			//System.out.print(ope);
		}
		
		
		return post;
		
	}//end toPostfix
	
	
	public static boolean check(char newx, char oldy){
		
		int i, priNew = 0, priOld=0;
		
		if(oldy == '(') return true;
		for(i = 0 ; i < 4; i ++){
			if(newx == priority[i]){
				priNew = i;
			}
			if(oldy == priority[i]){
				priOld = i;
			}
		}
		
		
		
		return priNew < priOld;
	}//end check
	
	
	
}//end class
