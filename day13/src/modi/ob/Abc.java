package modi.ob;

public class Abc {
	int k = 5;
	static int n = 10;
	public void m(){
		System.out.println("mm");
		
		// ���⼭�� �Լ� ��ü�� new �� ���� ��������� ������ k�� ����϶�� ���ص� ���� �ȳ���.
		System.out.println("mm"+k);
	}
	public static void play(){
		// k�� new�ؼ� ���� ���¿��� �� �� �ֱ� ������, static�� �ƴ� �ֵ��� �� �� ����.
		//System.out.println("pppppp"+k);
		System.out.println("pppppppp");
	}
}
