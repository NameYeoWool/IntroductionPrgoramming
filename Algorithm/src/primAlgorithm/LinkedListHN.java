package primAlgorithm;

public class LinkedListHN {
	
	private Node head;
	
	public LinkedListHN(){
		head = new Node();
	}
	
	 
	public boolean search(int item){
		Node cur = head.link;
		
		while (cur != null){
			if(cur.data == item) return true;
			cur = cur.link;
		}
		return false;
	}
	public int length(){
		int cnt = 0;
		Node cur = head;
		
		while(cur.link != null){
			cur = cur.link;
			cnt ++;
		}
		
		return cnt;
	}

	
	public void delete(Node pos){
		if(pos.link != null){
			pos.link = pos.link.link;
		}
	}
	
	public void insert(int value){
		Node temp = new Node();
		temp.data =value;
		temp.link = head.link;
		head.link = temp;
	}
	
	public void insert(int value, int value2){
		Node temp = new Node();
		temp.data= value;
		temp.data2 = value2;
		temp.link = head.link;
		head.link = temp;
	}
	
	public String toString(){
		String s = "";
		Node cur = head.link;
		
		while(cur != null){
			s = " ( "+ cur.data + " , " + cur.data2 + " ) " + s;
			cur = cur.link;
		}
		
		return s;		
		
	}
	
}
