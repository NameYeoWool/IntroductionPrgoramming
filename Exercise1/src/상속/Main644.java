package »ó¼Ó;

import java.util.Scanner;

class Figure{
	static final double PI= 3.14;
	protected double x, y;
	protected double area;
	
	void cal(double x, double y){
		area = x*y;
	}
	
	void set(double area){
		this.area = area;
	}
	
	void out(){
		System.out.println("arae : " + area);
	}
	
	
}

class Circle extends Figure{
	double radius;
	Circle(double radius){
		set(radius*radius*PI);
	}
	
	void out(){
		System.out.printf("Circle's area : %.1f\n" , area );
	}
	
}


class Triangle extends Figure{
	double base , height;
	Triangle(double base, double height){
		set(base*height/2);
	}
	
	void out(){
		System.out.printf("Triangle's area : %.1f\n" , area );
	}
	
}

class Rectangle extends Figure{
	double width, length;
	Rectangle(double width, double length){
		cal(width,length);
	}
	void out(){
		System.out.printf("Rectangle area : %.1f\n", area );
	}
	
}




public class Main644 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Circle c = new Circle(scan.nextDouble());
		Triangle t = new Triangle(scan.nextDouble(),scan.nextDouble());
		Rectangle r = new Rectangle(scan.nextDouble(),scan.nextDouble());
		
		
		c.out();
		t.out();
		r.out();
	}

}
