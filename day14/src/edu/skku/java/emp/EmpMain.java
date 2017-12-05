package edu.skku.java.emp;

public class EmpMain {
	
	public static void main(String[] args) {
		
	
		EmpManager mgr = new EmpManager();
		mgr.add(new Employee(1002,"kim",5000));
		mgr.add(1003,"lee",7000);
		mgr.add(new Employee(1004,"park",6500));
		
		
		mgr.search();
		Employee[] es = mgr.allEmp();
		for(Employee e: es){
			System.out.println(e);
		}
		
		System.out.println("========°Ë»ö:1003");
		System.out.println(mgr.search(1003));
		
		Math.sin(3.12);
		Math.max(3, 5);
		Math.round(3.456);
	}
}
