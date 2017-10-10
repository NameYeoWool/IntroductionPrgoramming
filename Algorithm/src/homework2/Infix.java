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
			//괄호 처리
			if(str1.charAt(i)=='('){
				ch = str1.charAt(i);
				operators.push(ch);
				
			//괄호 처리
			}else if(str1.charAt(i)==')'){
				// pop until '(' is out
				while(true){
					ch = operators.peak();
					operators.pop();
					// '('을 만나면 while 문 break; - '(' 출력 안되게
					if(ch == '(') break;
					post += Character.toString(ch);
					//System.out.print(ch);
					
					
					
				}
			// 변환
			}else{
				ch = str1.charAt(i);
				//숫자가 아닌 연산자는 스택에 쌓기
				if(ch>'9' || ch <'0'){
					//우선 순위 비교 - 비었으면 바로 집어 넣는다.
					if(operators.isEmpty()) {
						operators.push(ch);
						continue;
					//비어있지 않은 경우
					}else{
						char op = operators.peak();

						//새로 들어온 연산자의 우선순위가 낮은 경우
						if(check(ch,op)){
							operators.push(ch);
							
						//새로 들어온 연산자의 우선순위가 높은 경우
						}else{
							operators.pop();
							operators.push(ch);
							post += Character.toString(ch);
							//System.out.print(op);
						}
						
					}
					
				//숫자는 출력
				}else{
					post += Character.toString(ch);
					//int n = ch-'0';// 문자를 숫자로 변환
					//System.out.print(n);
				}
			}
			
		}
		
		
		char ope;
		
		//남아 있는 연산자 출력
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
