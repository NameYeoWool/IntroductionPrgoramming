package °´Ã¼ÁöÇâ2;

import java.util.Scanner;

class Time{
	int hour, min, sec;
	
	Time(){
		set( 0 , 0 , 0 );
	}
	
	Time(int hour){
		set(hour,0,0);
	}
	
	Time(int hour, int min, int sec){
		set(hour,min,sec);
	}
	
	void set(int hour, int min, int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	void out(){
		System.out.printf("hour : %d, minute : %d, second : %d\n",hour,min,sec);
	}
	
}

public class Main635 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Time t1 = new Time();
		Time t2 = new Time(scan.nextInt());
		Time t3 = new Time(scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		
		System.out.print("Midnight -> ");
		t1.out();
		System.out.print("Input time -> ");
		t2.out();
		System.out.print("Promise -> ");
		t3.out();
		
		
		
	}

}
