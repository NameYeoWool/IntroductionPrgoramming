package greedyAlgorithms;

public class LinkedListHN {
	
	private Node head;
	
	public LinkedListHN(){
		head = new Node();
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
	public Node nodeAt(int k){
		Node cur;
		int i = 0 ;
		
		cur = head;
		while(cur.link != null && i <k){
			cur = cur.link;
			i++;
		}
		
		if(cur.link == null){
			return null;
		}
		return cur;
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
	
}
