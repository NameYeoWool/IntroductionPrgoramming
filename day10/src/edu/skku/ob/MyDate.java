package edu.skku.ob;

public class MyDate {
	int year, month, day; // Member ����
	
	
	//������ : Constructor
	//Ŭ������ �̸��� ����, ���� Ÿ���� ����� �Ѵ�.
	//����, new �� �� ȣ���.
	public MyDate(){}// �⺻ ������
	public MyDate(int y, int m, int d){
		year= y;
		month = m;
		day = d;
	}
	//OverLoading
	//�̸��� ���� �ϰ�,
	//�Ű������� �ٸ����ؼ� �����ϴ� ���
	public MyDate(int month, int day){
		year= 2017;
		this.month = month;//���ú���- �Ű������� ���������� ����. �޼ҵ� ������
		this.day = day;
	}
	public void info(){
		System.out.println(year + "��" + month + "��"
				+day + "��");
		
	}

}
