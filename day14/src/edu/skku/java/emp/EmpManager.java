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
	
	// �Ʒ��� search()��  ȭ�鿡 ����ִ°� �ƴ϶� console�� 
	// ����ִ� ���̹Ƿ� �츮�� Ȯ���� �� �ִ� �����̴�.
	public void search(){
		for(int i = 0 ; i< index; i++){
			System.out.println(emps[i]);
		}
	}
	
	//�Ʒ��� ���� return�� ���־�� �ϸ鿡�� data�� �ѷ��� �� �ִ�.
	public Employee[] allEmp(){
		Employee[] result = new Employee[index];
		
		for(int i=0 ; i< index; i++){
			result[i] = emps[i];
		}
		
		return result;
		// java �� �迭�� �ѱ� ��, class type���� �ѱ�� ������ length
		// �θ� �� ������ C �� ���� �ּҰ��� �Ѿ�� �ȵȴ�.
		//- length ������ �� �θ�
		
		//return emps; // ����ִ� �������� �ٳ��󰣴�.
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
