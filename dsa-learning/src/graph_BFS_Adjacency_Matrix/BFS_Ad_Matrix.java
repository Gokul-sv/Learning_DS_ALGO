package graph_BFS_Adjacency_Matrix;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS_Ad_Matrix {
	ArrayList<GNode> node_al;
	int adjacencyMatrix[][];
	
	public BFS_Ad_Matrix(ArrayList<GNode> node_al)
	{
		this.node_al=node_al;
		adjacencyMatrix=new int[node_al.size()][node_al.size()];
	}
	
	void addUnDirGraph(int vertex,int edge)
	{
		vertex--;
		edge--;// -- bez array starts from 0
		
		adjacencyMatrix[vertex][edge]=1;
		adjacencyMatrix[edge][vertex]=1;
	}
	
	void bfs() {
		for(GNode node: node_al) { //if a node is unvisited then run bfs on it
			if(!node.isVisited())
				bfsVisit(node);
		}
	}
	//BFS internal method
		void bfsVisit(GNode node) {
			LinkedList<GNode>queue = new LinkedList<>();
			queue.add(node); //add source node to queue
			while(!queue.isEmpty()) {
				GNode presentNode = queue.remove(0);
				presentNode.setVisited(true);
				System.out.print(presentNode.getVertex()+" ");
				
				ArrayList<GNode> neighbors = getNeighbors(presentNode);
				for(GNode neighbor: neighbors) { 	//for each neighbor of present node
					if(!neighbor.isVisited()) {
						queue.add(neighbor);
						neighbor.setVisited(true);
					}
				}//end of for loop
			}//end of while loop
		}//end of method
		
		
		
		// get all neighbors of a particular node by checking adjacency matrix and add it to neighbours arraylist
		public  ArrayList<GNode> getNeighbors(GNode node) {
			ArrayList<GNode> neighbors = new ArrayList<GNode>();
			
			//gets row# to search in node index
			int nodeIndex = node.getindex();
		
			for(int i=0; i<adjacencyMatrix.length;i++) {
				//if a column has 1 in that row then there is a neighbor and add it to list
				if(adjacencyMatrix[nodeIndex][i]==1) {
					neighbors.add(node_al.get(i));
				}
			}
			return neighbors;
		}

	
}
