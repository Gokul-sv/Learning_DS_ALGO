package graph_BFS_Adjacenc_List;

import java.util.LinkedList;

public class BFS_Ad_List {
	private int no_of_vertex;
	private LinkedList<Integer> adjList[];
	
	
	public BFS_Ad_List(int no_of_vertex) 
	{
		this.no_of_vertex=no_of_vertex;
		adjList=new LinkedList[no_of_vertex];
		for(int i=0;i<no_of_vertex;i++)
		{
			adjList[i]=new LinkedList();
		}
	}
	
	void addUnDir(int vertex,int edge)//if input starts from 0 no need of any modification if it starts from 0 we have to -1 the vertex becz LL array stats from 0 
	{
		adjList[vertex].add(edge);
	}
	
	void bfs(int s)
	{
		boolean visited[]=new boolean[no_of_vertex];
		LinkedList<Integer> q = new LinkedList();
		
		visited[s]=true;
		q.add(s);
		while(!q.isEmpty())
		{
			s=q.pop();
			System.out.print(s+" ");
			//java 8 way
			adjList[s].forEach((curVertex)->
						{
							if(!visited[curVertex])
							{
								visited[curVertex]=true;
								q.add(curVertex);
							}						
						}					
					);
		}
		
	}
}
