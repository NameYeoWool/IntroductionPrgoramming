package greedyAlgorithms;

public class Graph {
	
	private int n;
	
	public Graph(int n){
		this.n = n ;
	}
	
	
	public int[][] graph = new int [n][n];

	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	
	
	
}
