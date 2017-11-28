package modi.ob;

public class Abc {
	int k = 5;
	static int n = 10;
	public void m(){
		System.out.println("mm");
		
		// 여기서는 함수 자체가 new 를 통해 만들어지기 땜누에 k를 출력하라고 명해도 에러 안난다.
		System.out.println("mm"+k);
	}
	public static void play(){
		// k는 new해서 만든 상태에서 쓸 수 있기 때문에, static이 아닌 애들을 쓸 수 없다.
		//System.out.println("pppppp"+k);
		System.out.println("pppppppp");
	}
}
