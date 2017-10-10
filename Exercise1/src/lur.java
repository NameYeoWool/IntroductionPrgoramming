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
       int memoryState[][]=new int[M][k];      //��½� ����� �迭
       int ws[] = new int[w];
       //refString �Է¹ޱ�
       for(int i=0;i<k;i++){
          refString[i]=input.nextInt();
       }
       
       int count1=0;   //���� ���ִ� Frame ����
       
       for(int time=1;time<=k;time++){
          int count2=0;   
          
          boolean check = false;
          for(int j=0;j<M;j++){
        	if(frame[j] == refString[time-1]){
        		timeStamp[j]=time;
        		check = true;
        	}
          }
          
          // cheeck - �����ӿ� refstring�� �ֳ� ���� Ȯ���ϴ� boolean
          // frame �ȿ� ������  // timeStamp �� ������ ���� �����.
          if(check){
        	  // �ð� ������ ������
        	  for(int j = 0 ; j <M; j++){
        		  if(timeStamp[j] < time-w){
        			  frame[j]=0;
        		  }
        	  }
        //frame �ȿ� ������
          }else{
        	  
        	  
          }
        	
        	 /*
             //frame�� �̹� �� �ִ� ���(pageFault�� �ƴ� ���)
             if(frame[j]==refString[time-1]){
                timeStamp[j]=time;
                break;
             }else{
                count2++;
               //page fault�� ���
               if(count2==M){
                  pageFault[time-1]="F";
                  //����ִ� frame�� �ִ� ���
                  if(count1!=M){
                     frame[count1++]=refString[time-1];
                     timeStamp[count1-1]=time;
                  }else{
                  //frame�� ��� ���ִ� ���(���� ������ ���Ŷ� �ٲ��ֱ�)
                     int min=time;
                     int count3=0;
                     //���� ������ �� frame���� page ã��
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
          //��½� ����� memoryState�迭 ä���
          for(int i=0;i<M;i++){
             memoryState[i][time-1]=frame[i];
          }
       }
       
       //���
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