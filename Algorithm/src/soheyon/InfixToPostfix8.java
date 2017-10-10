package soheyon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfixToPostfix8 {
	   public static void main(String[] args) {

	      Scanner s = new Scanner(System.in);
	      String sik = s.next();

	      List<Character> operand2 = new ArrayList<Character>();

	      List operand3 = new ArrayList();

	      Stack stack2 = new Stack();
	      Stack stack3 = new Stack();
	      Stack stack=new Stack();

	      stack3.push('0');
	      stack2.push('0');
	      
	      // sik으로 받으온 str을 분해해서 char로 한개씩 리스트에 저장해줄 것이다.. 
	      // 저장할 때 postfix형태로 들어가게 만들었음. 
	      
	      for (int j = 0; j < sik.length(); j++) {
	         char and = sik.charAt(j);
	         char prior;

	         if ('0' <= and && and <= '9') {
	            operand2.add(and); //숫자일 경우 add

	            // 각 연산자에 대해 우선순위를 부여해주고 stack을 활용하여 list에 넣어주었다. 
	         } else if(and=='(') { 
	            prior = '1';
	            stack2.push(and);
	            stack3.push(prior); 
	            //열린 괄호는 스택에 들어있는 연산자의 우선순위 상관없이 무조건 push 해주었고, 가장 낮은 우선순위 부여했다. 
	            
	         } else if(and==')'){
	            while (stack3.peak() != '1') {
	               operand2.add(stack2.peak());

	               stack2.pop();
	               stack3.pop();
	            } // 열린 괄호 나올 때 까지 pop 해준다.
	            
	            stack2.pop();
	            stack3.pop();
	            
	         } else if(and=='+'|and=='-'){
	            prior='2';
	            if (stack3.peak() - '0' <= and - '0') {
	               stack2.push(and);
	               stack3.push(prior);

	            } else {
	               while (stack3.peak() - '0' > prior - '0') {
	                  operand2.add(stack2.peak());
	                  stack2.pop();
	                  stack3.pop();
	               }
	               stack2.push(and);
	               stack3.push(prior);
	            } 
	         }else if(and=='/'|and=='*'|and=='%'){
	            prior='3';
	            if (stack3.peak() - '0' <= prior - '0') {
	               stack2.push(and);
	               stack3.push(prior);
	            } else {
	               while (stack3.peak() - '0' > prior - '0') {
	                  operand2.add(stack2.peak());
	                  stack2.pop();
	                  stack3.pop();
	               }
	               stack2.push(and);
	               stack3.push(prior);
	            }
	         }else if(and=='~'){
	            prior='4';
	            if (stack3.peak() - '0' <= prior - '0') {
	               stack2.push(and);
	               stack3.push(prior);
	               } else {
	                  while (stack3.peak() - '0' > prior - '0') {
	                     operand2.add(stack2.peak());
	                     stack2.pop();
	                     stack3.pop();
	                     }
	                  stack2.push(and);
	                  stack3.push(prior);
	                  }         
	         }

	         }//END FOR 

	   while(stack3.peak()!='0')

	   {
	      operand2.add(stack2.peak());
	      stack2.pop();
	      stack3.pop();
	   }
	   //스택에 남은 연산자 모두 pop해줌
	   // operand2라는  array list에 수식을 postfix 형태로 받아주었음.   
	   
	   System.out.println("Postfix");
	   for(int i=0;i<operand2.size();i++){
	      System.out.print(operand2.get(i));
	   } //postfix print

	   
	   //여기서부터는 postfix계산 과정
	   stack.push('0');
	   DoubleStack Dstack=new DoubleStack();
	   Dstack.push(0);

	   for(int i=0;i<operand2.size();i++){
	      char a=operand2.get(i);      
	      char b;
	      double c;
	      
	      if (a<='9' && a>='0' ){
	         stack.push(a);
	         
	         double A=Double.parseDouble(Character.toString(a));
	         Dstack.push(A); // 숫자인 경우, 스택에 넣어줌 
	         
	         //연산자 나오면 숫자 pop하여 계산하고 다시 push해줌. 
	      }else if(a=='~'){
	         
	         char p=stack.peak();
	         double num3=Double.parseDouble(Character.toString(p));
	         
	         stack.pop();
	         Dstack.pop();
	         c=-num3;
	         b=(char)c;
	         stack.push(b);
	         Dstack.push(c);
	         
	      }else{
	         char p=stack.peak();//p='4'
	         String q=Character.toString(p);
	         double num2=Double.parseDouble(q);//'4' > "," >
	         stack.pop();
	         Dstack.pop();
	         
	         p=stack.peak();
	         double num=Double.parseDouble(Character.toString(p));
	         stack.pop();
	         Dstack.pop();
	         
	         if(a=='+'){
	            c=(num+num2);
	            b=(char)(c+'0');

	            stack.push(b);            
	            Dstack.push(c);            

	         }else if(a=='-'){
	            c=(num-num2);
	            b=(char)(c+'0');
	            stack.push(b);
	            Dstack.push(c);            
	            
	         }else if(a=='/'){
	            c=(num/num2);
	            b=(char)(c+'0');
	            stack.push(b);
	            Dstack.push(c);            

	         }else if(a=='*'){
	            c=(num*num2);
	            b=(char)(c+'0');
	            stack.push(b);            
	            Dstack.push(c);            

	         }else if(a=='%'){
	            c=(num%num2);
	            b=(char)(c+'0');
	            stack.push(b);
	            Dstack.push(c);            

	         }
	         
	      }
	      
	   }//end for2
	   int result=stack.peak()-'0';
	   System.out.println();
	   double Result=Dstack.peak();
	   System.out.println("Result: "+Result);
	   
	}// end main
	   
	}// end class