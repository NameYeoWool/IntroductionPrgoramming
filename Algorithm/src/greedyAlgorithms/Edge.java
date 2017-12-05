package greedyAlgorithms;

public class Edge {
	private Node from;
	private Node to;
	
	public Edge(Node x, Node y){
		this.from = x;
		this.to = y;
	}

	public Node getFrom() {
		return from;
	}

	public void setFrom(Node from) {
		this.from = from;
	}

	public Node getTo() {
		return to;
	}

	public void setTo(Node to) {
		this.to = to;
	}
	
	
	
	
}
