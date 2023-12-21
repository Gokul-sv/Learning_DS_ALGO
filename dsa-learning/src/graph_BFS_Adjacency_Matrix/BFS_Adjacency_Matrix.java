package graph_BFS_Adjacency_Matrix;

import java.util.ArrayList;

public class BFS_Adjacency_Matrix {

	public static void main(String[] args) {
		
		ArrayList<GNode> node_al = new ArrayList<>();
		//creating 4 vertex		
		for(int i=1;i<=4;i++)
		{
			node_al.add(new GNode("V"+i,i-1));
		}
		
		BFS_Ad_Matrix bfs = new BFS_Ad_Matrix(node_al);
		
		bfs.addUnDirGraph(1,2);
		bfs.addUnDirGraph(1,3);
		bfs.addUnDirGraph(3,4);
		
		bfs.bfs();
		
		
		
	}

}
