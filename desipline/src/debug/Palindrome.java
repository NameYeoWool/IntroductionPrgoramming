package debug;


import java.util.Scanner;

public class Palindrome {

   public static void main(String[] args) {
      
      
      
      System.out.println("Enter a palindrome number");
      Scanner s=new Scanner(System.in);
      String pal=s.next();//str 받음
      System.out.println(pal+"pal");
      
      String[] palin=pal.split("");//숫자분리, str리스트 팔린
      System.out.println(palin+"palin");
      
      int k=palin.length;//함수뭐임
      System.out.println(k+"k");
      Stack st=new Stack();//숫자로 받아야 함
      Queue qu=new Queue();

            
      for(int i=0;i<=(k-1);i++){
         
         int num=Integer.parseInt(palin[i]);
         System.out.println(num);
         st.push(num);
      }//st에 받기
      System.out.println(st);

      
      for(int m=0;m<=(k-1);m++){
         int num1=Integer.parseInt(palin[m]);
         qu.enqueue(num1);
      }//queue받기 
      System.out.println(qu);
      System.out.println(qu.peak());
      System.out.println(st.peak());

      while(!qu.isEmpty()){
         if(st.peak()==qu.peak()){
            
            st.pop();
            qu.dequeue();
            
            
            if(qu.isEmpty()){
               System.out.println("is a palindrome");
         //안나온다ㅠㅠ왜?
            }
            

         }
         else{
            System.out.println(st.peak());
            System.out.println(qu.peak());
            System.out.println("is not a palindrome.");
            break;
         }
         
         //System.out.println("is a palindrome");
            
         }
      

   }//end main

}//end class
