package °´Ã¼ÁöÇâ2;

import java.util.Scanner;
 
class Taxi{
	static int tank = 1000;
	static int cnt = 0 ;
	private int num,fuel;
	
	Taxi(){
		this(70);
	}
	Taxi(int fuel){
		setFuel(fuel);
		num=cnt;
	}
	
	void setFuel(int fuel){
		if( fuel> 70) fuel = 70;
		this.fuel = fuel;
		
	}
	
	void run(int fuel){
		if((this.fuel-fuel)<0) this.fuel=0;
		else this.fuel= this.fuel- fuel;
	}
	
	void refuel(int fuel){
		if((this.fuel + fuel)>70){
			tank = tank - ( 70 - this.fuel);
			this.fuel = 70;
		}else{
			tank = tank -fuel;
			this.fuel= this.fuel + fuel;
			
		}
		
	}
	
	int getNum(){
		return num;
	}
	
	int getFuel(){
		return fuel;
	}
	int getTank(){
		return tank;
	}
	
} 
public class Main238 {
 
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	Taxi[] taxi = new Taxi[55];
    	
    	boolean check = false;
    	while(true){
    		
    		System.out.printf("0. end, 1. taxi_add, 2. taxi_run, 3. taxi_fueladd ");
    		int n = scan.nextInt();
    		
    		switch(n){
    		case 0: System.out.print("END!");
    				check = true;
    				break;
    		case 1: System.out.printf("First fuel? (full = 0) ");
    				int fuel = scan.nextInt();
    				if( fuel == 0) taxi[++Taxi.cnt]= new Taxi();
    				else taxi[++Taxi.cnt]=new Taxi(fuel);
    				System.out.printf("Taxi number : %d, fuel liters : %d\n\n",taxi[Taxi.cnt].getNum(),taxi[Taxi.cnt].getFuel());
    				break;
    		case 2: System.out.print("Taxi number? ");
    				int taxiNumber = scan.nextInt();
    				if( taxiNumber > Taxi.cnt) {
    					System.out.print("No Taxi number\n\n");
    					break;
    				}
    				
    				System.out.printf("fuel consumption? ");
    				int consumption = scan.nextInt();
    				taxi[taxiNumber].run(consumption);
    				
    				System.out.printf("Taxi number : %d, fuel liters : %d\n\n",taxi[taxiNumber].getNum(),taxi[taxiNumber].getFuel());
    				break;
    				
    		case 3: System.out.printf("Taxi number? ");
    				int taxiNumber2 = scan.nextInt();
    				if( taxiNumber2 > Taxi.cnt){
    					System.out.print("No Taxi number\n\n");
    					break;
    				}
    				
    				System.out.printf("fuel add? ");
    				int add = scan.nextInt();
    				taxi[taxiNumber2].refuel(add);
    				System.out.printf("Taxi number : %d, fuel liters : %d\n",taxi[taxiNumber2].getNum(),taxi[taxiNumber2].getFuel());
    				System.out.printf("Tank liters : %d\n\n",Taxi.tank);
    				break;
    		default :
    				System.out.println("END!");
    				check = true;
    				break;
    				
    			
    		}
    		
    		if(check) break;
    		
    		
    	}
    	
    	
    }
 
}