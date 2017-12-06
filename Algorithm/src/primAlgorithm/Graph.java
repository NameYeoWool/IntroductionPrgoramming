package primAlgorithm;

import java.util.Arrays;

public class Graph {
	
	private int n;
	public int[][] graph;
	public int[][] cost ;
	public Graph(int n){
		this.n = n ;
		this.graph=new int[n][n];
		this.cost = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0; j < n; j++){
				cost[i][j] = Integer.MAX_VALUE;
			}
		}
		
	}

	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	
	
	
}
