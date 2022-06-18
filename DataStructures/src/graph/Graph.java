package graph;

import java.util.LinkedList;

/**
 * Implementation of depth first search of Graph DFS- Create a visited Array and
 * visit all the vertices of given node Before visiting check if the node is
 * previously visited BFS - Create a visited Array Mark the visited array and
 * add all the vertices of given Node to a q. poll the visited Node
 * 
 * @author Karthik
 *
 */
public class Graph {

	private int vertices;
	LinkedList<Integer> adj[];

	// Constructor
	Graph(int v) {

		vertices = v;
	
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}

	}

	public void addEdge(int ref, int value) {

		adj[ref].add(value);
	}

	public static void main(String args[]) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.DFS(2);
		g.BFS(2);
	}

	private void BFS(int i) {

		LinkedList<Integer> connectedNode = adj[i];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[vertices];
		visited[i] = true;
		queue.add(i);
		while (!queue.isEmpty()) {
			int val = queue.poll();
			System.out.print(val+" ");
			for (Integer intVal : connectedNode) {
				if (!visited[intVal]) {
					queue.add(intVal);
					visited[intVal] = true;
				}

			}
		}
	}

	private void DFS(int i) {
		// TODO Auto-generated method stub

		boolean visited[] = new boolean[vertices];
		DFSUtil(i, visited);
	}

	private void DFSUtil(int i, boolean[] visited) {

		LinkedList<Integer> connectedList = adj[i];
		visited[i] = true;
		System.out.println(i + " ");
		for (Integer val : connectedList) {

			if (!visited[val])
				DFSUtil(val, visited);
		}

	}
}
