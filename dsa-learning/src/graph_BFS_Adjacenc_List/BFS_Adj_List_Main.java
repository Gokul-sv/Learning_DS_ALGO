package graph_BFS_Adjacenc_List;

public class BFS_Adj_List_Main {

	public static void main(String[] args) {
		
		BFS_Ad_List graph = new BFS_Ad_List(4);
		
		graph.addUnDir(0, 1);
		graph.addUnDir(0, 2);
		graph.addUnDir(1, 2);
		graph.addUnDir(2, 0);
		graph.addUnDir(2, 3);
		graph.addUnDir(3, 3);
		graph.bfs(2);
		
	
	}

}
