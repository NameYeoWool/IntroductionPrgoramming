package dataType;

public class TypeTest {
	public static void main(String[] args) {
		int age = 22;
		
		//char �� ""�� �ָ� ��������. '' �־�� ��. 
		// String ���� �����ϰ� ������ String = "A" ����
		String grade2 = "B";
		
		char grade = 'A';
		double score = 4.5;
		
		// "" �� ''�� �ָ� ���� ����.
		String name = "diana";
		
		boolean result = score>4.0;
		
		int k = 50;
		double d = 50.0;
		
		//Ÿ���� ���� �����Ƿ� error
		// ����� �����Ͱ� ū���� ���ϸ� ������� ū ���� ���󰣴�.
		// ū ����� �ִ� ���� �����Ϳ� �������ؼ� error
		int ans = (int)(k+d); // type Casting���� �����ذ�
		double ans2 = k + d; // ���� ������ double �� �ؼ� ���� �ذ�
		
		int ans3 = k + (int)d;// type Casting
		
	}
}
