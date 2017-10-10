package °´Ã¼ÁöÇâ2;

import java.util.Scanner;

class Time{
	int hour, min, sec;
	
	
	
	Time (){
		this(0,0,0);
	}
	
	Time(int hour){
		set(hour,0,0);
	}
	
	Time(int hour, int min, int sec){
		set(hour,min,sec);
	}
	
	void set(int hour, int min, int sec ){
		this.hour = hour;
		this.min = min;
		this.sec= sec;
	}
	
	void out(){
		System.out.printf("hour : %d, minute : %d, second : %d\n",hour,min,sec);
	}
}

public class Main638 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Time mid = new Time();
		Time in = new Time(scan.nextInt());
		Time pro = new Time(scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		System.out.print("Midnight -> ");
		mid.out();
		System.out.print("Input time -> ");
		in.out();
		System.out.print("Promise -> ");
		pro.out();
	}
}
