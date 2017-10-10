import java.util.Scanner;

public class lur {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int N = input.nextInt();
       int k = input.nextInt();
       int M = input.nextInt();
       int w = input.nextInt();
       
       int refString[] =new int[k];
       int timeStamp[] = new int[M];
       int frame[] = new int[M];
       String pageFault[] = new String[k];
       int memoryState[][]=new int[M][k];      //출력시 사용할 배열
       int ws[] = new int[w];
       //refString 입력받기
       for(int i=0;i<k;i++){
          refString[i]=input.nextInt();
       }
       
       int count1=0;   //현재 차있는 Frame 갯수
       
       for(int time=1;time<=k;time++){
          int count2=0;   
          
          boolean check = false;
          for(int j=0;j<M;j++){
        	if(frame[j] == refString[time-1]){
        		timeStamp[j]=time;
        		check = true;
        	}
          }
          
          // cheeck - 프레임에 refstring이 있냐 없냐 확인하는 boolean
          // frame 안에 있으면  // timeStamp 는 위에서 새로 찍었다.
          if(check){
        	  // 시간 지나면 나가리
        	  for(int j = 0 ; j <M; j++){
        		  if(timeStamp[j] < time-w){
        			  frame[j]=0;
        		  }
        	  }
        //frame 안에 없으면
          }else{
        	  
        	  
          }
        	
        	 /*
             //frame에 이미 들어가 있는 경우(pageFault가 아닌 경우)
             if(frame[j]==refString[time-1]){
                timeStamp[j]=time;
                break;
             }else{
                count2++;
               //page fault인 경우
               if(count2==M){
                  pageFault[time-1]="F";
                  //비어있는 frame이 있는 경우
                  if(count1!=M){
                     frame[count1++]=refString[time-1];
                     timeStamp[count1-1]=time;
                  }else{
                  //frame이 모두 차있는 경우(제일 예전에 쓴거랑 바꿔주기)
                     int min=time;
                     int count3=0;
                     //제일 예전에 쓴 frame에든 page 찾기
                     for(int t=0;t<M;t++){
                        if(timeStamp[t]<min){
                           min = timeStamp[t];
                           count3=t;
                        }
                     }
                     timeStamp[count3]=time;
                     frame[count3]=refString[time-1];
                  }
               }
             }
          }
          */
          //출력시 사용할 memoryState배열 채우기
          for(int i=0;i<M;i++){
             memoryState[i][time-1]=frame[i];
          }
       }
       
       //출력
       //time
       for(int i=0;i<k;i++){
          System.out.printf("%-3s",(i+1));
       }
       System.out.println();
       //Ref.string
       for(int i=0;i<k;i++){
          System.out.printf("%-3s",refString[i]);
       }
       System.out.println();
       //Memory State
       for(int i=0;i<M;i++){
          for(int j=0;j<k;j++){
             System.out.printf("%-3s",memoryState[i][j]);
          }
          System.out.println();
       }
       //Page Fault
       for(int i=0;i<k;i++){
          if(pageFault[i]!=null) {
             System.out.printf("%-3s",pageFault[i]);
          }else{
             System.out.print("   ");
          }
       }
           }
}