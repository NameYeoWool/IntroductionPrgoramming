package operator;

public class OpTest {
	
	public static void main(String[] args) {
		int a = 20;
		a =  a + 1;
		System.out.println(a); // 21
		a++; // a = a +1 ;
		System.out.println(a); // 22
		--a; // a = a- 1;
		System.out.println(a); // 21
		a--;
		System.out.println(a); // 20 
		System.out.println(a--); // �۾� �����ϰ� ���� -1   // 20
		System.out.println(--a);// -1 �ϰ� �۾� ����  // 18
		
		
		// ctrl  + D  ���� ����
		// �����̵� alt + ������ , �Ʒ����� ȭ��ǥ
		// ctrl + alt  + �Ʒ����� ȭ��ǥ - ����
				
		
		a = 5;
		int b = a--;// �۾� ����( b���ٰ� a �� �־��)�ϰ� a ���ҽ�Ŵ - �������� ����
		System.out.println(b);// ��� 5����
		
		int c = --a; // �տ� --�� �پ����Ƿ� a ���ҽ�Ű�� �۾�����(c�� a�� �Ҵ�) - �� ó�� ����
		System.out.println(c);
		
	}
}
