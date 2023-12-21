package graph_BFS_Adjacency_Matrix;

import java.util.ArrayList;

public class GNode {
	private String vertex;//(vertex name) 
	private int index;// position /(Column)
	private ArrayList<GNode> neighbour = new ArrayList<GNode>(); //neighbours or edges for this vertex 
	private boolean visited=false;
	
	
	public GNode(String vertex,int index)
	{
		this.vertex=vertex;
		this.index=index;
	}
	public String getVertex() {
		return vertex;
	}
	public void setVertex(String vertex) {
		this.vertex = vertex;
	}
	public int getindex() {
		return index;
	}
	public void setindex(int index) {
		this.index = index;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
