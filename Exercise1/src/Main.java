
import java.util.Scanner;

class Taxi {
	static int tank = 1000;
	static int cnt = 0;
	private int num, fuel;

	Taxi() {
		this(70);
	}

	Taxi(int fuel) {
		cnt++;
		num = cnt;
		setFuel(fuel);
	}

	void setFuel(int fuel) {
		this.fuel = fuel;
	}

	void run(int fuel) {
		this.fuel = this.fuel - fuel;
	}

	void refuel(int fuel) {
		tank = tank - fuel;
		this.fuel = this.fuel + fuel;
	}

	static int getTank() {
		return tank;
	}

	int getNum() {
		return num;
	}

	int getFuel() {
		return fuel;
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Taxi[] taxi = new Taxi[55];
		int i = 1;

		while (true) {
			System.out.print("0. end, 1. taxi_add, 2. taxi_run, 3. taxi_fueladd ");
			int n = scan.nextInt();
			
			if (n == 1) {

				System.out.print("First fuel? (full = 0) ");
				int f = scan.nextInt();
				if (f > 70)
					f = 70;
				else if (f <= 0)
					f = 0;

				if (f == 0) {
					taxi[i] = new Taxi();
					System.out.printf("Taxi number : %d, fuel liters : %d\n", taxi[i].getNum(), taxi[i].getFuel());
					System.out.println();
				} else {
					taxi[i] = new Taxi(f);
					System.out.printf("Taxi number : %d, fuel liters : %d\n", taxi[i].getNum(), taxi[i].getFuel());
					System.out.println();

				}
				i++;

			} else if (n == 2) {
				System.out.print("Taxi number? ");
				int taxiNum = scan.nextInt();
				if (Taxi.cnt < taxiNum) {
					System.out.println("No Taxi number");
					System.out.println();
					continue;
				}

				System.out.print("fuel consumption? ");
				int con = scan.nextInt();
				if (con > taxi[taxiNum].getFuel()) con = taxi[taxiNum].getFuel();
				taxi[taxiNum].run(con);

				System.out.printf("Taxi number : %d, fuel liters : %d\n", taxi[taxiNum].getNum(),
						taxi[taxiNum].getFuel());
				System.out.println();

			} else if (n == 3) {
				System.out.print("Taxi number? ");
				int taxiNum = scan.nextInt();
				if (taxiNum > Taxi.cnt) {
					System.out.println("No Taxi number");
					System.out.println();
					continue;
				}

				System.out.print("fuel add? ");
				int add = scan.nextInt();
				if(taxi[taxiNum].getFuel()+add>70) add = 70 - taxi[taxiNum].getFuel();
				taxi[taxiNum].refuel(add);

				System.out.printf("Taxi number : %d, fuel liters : %d\n", taxi[taxiNum].getNum(),
						taxi[taxiNum].getFuel());
				System.out.println("Tank liters : " + Taxi.getTank());
				System.out.println();

			} else {
				System.out.println("END!");
				break;
			}
		}

	}
}