package homework3;

public class Hw3 {
	
	public static void main(String[] args) {
		Heap h = new Heap();
		h.insert(77);
		h.insert(61);
		h.insert(59);
		h.insert(48);
		h.insert(19);
		h.insert(11);
		h.insert(26);
		h.insert(15);
		h.insert(1);
		h.insert(5);
		h.getElement();
		h.heapSort();
		
		// 19 11 1 15 5 가 정렬이 덜 된 듯 하다.
		h.getElement();
	}
}
