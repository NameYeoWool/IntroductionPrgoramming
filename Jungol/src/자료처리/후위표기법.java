package 자료처리;

import java.util.Scanner;

public class 후위표기법 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int [] stack = new int[N];
      int i;
      
      int cnt = 0;
      int tmp;
      char x;
      for(i=0;i<N;i++){
         x = in.next().charAt(0);
         if( x>='0' && x<='9'){
            stack[cnt++] = x-'0';
         }
         
         else{
            if(x=='+'){
               stack[cnt-2] = stack[cnt-2] + stack[cnt-1];
            }
            else if(x=='-'){
               stack[cnt-2] = stack[cnt-2] - stack[cnt-1];
            }
            else if(x=='*'){
               stack[cnt-2] = stack[cnt-2] * stack[cnt-1];
            }
            else if(x=='/'){
               stack[cnt-2] = stack[cnt-2] / stack[cnt-1];
            }
            cnt--;
         }
      }
      System.out.println(stack[0]);
   }

}