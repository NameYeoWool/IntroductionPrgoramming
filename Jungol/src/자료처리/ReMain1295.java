package 자료처리;


import java.util.Scanner;

public class ReMain1295 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int [] arr = new int[N];
      
      int i,j;
      for(i=0;i<N;i++){
         arr[i] = in.nextInt();
      }
      
      int num = in.nextInt();
      int [] n = new int[num];
      int [] ans = new int[num];
      
      for(i=0;i<num;i++){
         n[i] = in.nextInt();
      }
      
      for(i=0;i<num;i++){
         for(j=0;j<N;j++){
            if(n[i] == arr[j])
            {
            	// 배열에 담았다가 출력하자 그래야 시간이 덜걸린다.
               ans[i] = j+1;
            }
            
            
         }
      }
      
      for(i=0;i<num;i++){
         System.out.println(ans[i]);
      }
   }

}