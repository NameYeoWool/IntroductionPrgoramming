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
	      
	      // sik���� ������ str�� �����ؼ� char�� �Ѱ��� ����Ʈ�� �������� ���̴�.. 
	      // ������ �� postfix���·� ���� �������. 
	      
	      for (int j = 0; j < sik.length(); j++) {
	         char and = sik.charAt(j);
	         char prior;

	         if ('0' <= and && and <= '9') {
	            operand2.add(and); //������ ��� add

	            // �� �����ڿ� ���� �켱������ �ο����ְ� stack�� Ȱ���Ͽ� list�� �־��־���. 
	         } else if(and=='(') { 
	            prior = '1';
	            stack2.push(and);
	            stack3.push(prior); 
	            //���� ��ȣ�� ���ÿ� ����ִ� �������� �켱���� ������� ������ push ���־���, ���� ���� �켱���� �ο��ߴ�. 
	            
	         } else if(and==')'){
	            while (stack3.peak() != '1') {
	               operand2.add(stack2.peak());

	               stack2.pop();
	               stack3.pop();
	            } // ���� ��ȣ ���� �� ���� pop ���ش�.
	            
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
	   //���ÿ� ���� ������ ��� pop����
	   // operand2���  array list�� ������ postfix ���·� �޾��־���.   
	   
	   System.out.println("Postfix");
	   for(int i=0;i<operand2.size();i++){
	      System.out.print(operand2.get(i));
	   } //postfix print

	   
	   //���⼭���ʹ� postfix��� ����
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
	         Dstack.push(A); // ������ ���, ���ÿ� �־��� 
	         
	         //������ ������ ���� pop�Ͽ� ����ϰ� �ٽ� push����. 
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