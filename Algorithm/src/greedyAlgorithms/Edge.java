package greedyAlgorithms;

public class Edge {
	private int closest;
	private int cur;
	
	public Edge(int x, int y){
		this.closest = x;
		this.cur = y;
	}

	public int getFrom() {
		return closest;
	}

	public void setFrom(int from) {
		this.closest = from;
	}

	public int getTo() {
		return cur;
	}

	public void setTo(int to) {
		this.cur = to;
	}
	
	
	
	
}
