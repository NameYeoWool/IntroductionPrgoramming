package greedyAlgorithms;

public class Node {
	
	public int vertex;
	Node link = null;
	
	
	public Node(int n){
		this.vertex = n;
	}


	public int getVertex() {
		return vertex;
	}


	public void setVertex(int vertex) {
		this.vertex = vertex;
	}


	public Node getLink() {
		return link;
	}


	public void setLink(Node link) {
		this.link = link;
	}
	
	

}
