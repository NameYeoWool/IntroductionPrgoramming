package edu.skku.java.emp;

public class EmpManager {
	Employee[] emps = new Employee[100];
	int index = 0;
	
	public void add(Employee e){
		emps[index++] = e;
	}
	
	public void add(int num, String name, int salary){
		//emps[index++]= new Employee(num,name,salary);
		add(new Employee(num,name,salary));
	}
	
	// 아래의 search()는  화면에 찍어주는게 아니라 console에 
	// 찍어주는 것이므로 우리만 확인할 수 있는 내용이다.
	public void search(){
		for(int i = 0 ; i< index; i++){
			System.out.println(emps[i]);
		}
	}
	
	//아래와 같이 return을 해주어야 하면에서 data를 뿌려줄 수 있다.
	public Employee[] allEmp(){
		Employee[] result = new Employee[index];
		
		for(int i=0 ; i< index; i++){
			result[i] = emps[i];
		}
		
		return result;
		// java 는 배열을 넘길 때, class type으로 넘기기 때문에 length
		// 부를 수 있지만 C 의 경우는 주소값만 넘어가서 안된다.
		//- length 같은거 못 부름
		
		//return emps; // 비어있는 공간까지 다날라간다.
	}
	
	public Employee search(int num){
		for(int i = 0 ; i < index; i++){
			if(num == emps[i].getNum()) return emps[i];
		}
		
		return null;
	}
	
	public int getTotalSalary(){
		int total = 0;
		for(int i = 0 ; i < index; i ++){
			total = total+ emps[i].getSalary();
		}
		return total;
	}
	
	public void getEmployees(int msalary){
		for(int i = 0 ; i < index; i++){
			if(msalary >= emps[i].getSalary()) System.out.println(emps[i]);
		}
	}
	
	public int getSize(){
		return index;
	}

}
