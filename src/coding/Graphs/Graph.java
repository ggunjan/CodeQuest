package coding.Graphs;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
import java.util.List;


public class Graph {
	
	private final int V;			// number of vertices 
	private static int E;					// number of Edges	
	private List<Integer> adjList[];// Adjacency List
	
	// Create a V-vertex graph with no graph
	Graph(int V) {
		this.V = V;   
		this.E = 0;
		adjList = new LinkedList[V];
		for(int i = 0; i < V; i++) {
			adjList[i] = new LinkedList(); // Initialize all list to empty
		}
	}
	
	/**
	 * 
	 * @param v  one vertex
	 * @param w  second vertex
	 * @throws IllegalArgumentException unless {0 <= v < V} and  {0 <= w < V}
	 */
	void addEdge(int v, int w) {
		validateVertex(v);
		validateVertex(w);
		adjList[v].add(w);
		E++;
	}
	
	/**
	 * 
	 * @param v the vertex
	 * @return the vertices adjacent to vertex { v}, as an Linkedlist 
	 * @throws IllegalArgumentException unless {0 <= v < V}
	 */
	public LinkedList<Integer> getAdj(int v) {
		validateVertex(v);
		return (LinkedList<Integer>)adjList[v];
	}
	
	// throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    } 
   
    
    /**
     * Returns the degree of vertex {@code v}.
     *
     * @param  v the vertex
     * @return the degree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int degree(int v) {
        validateVertex(v);
        return adjList[v].size();
    }
    
    /**
     * 
     * @return the number of vertices in the graph
     */
	public int V() {
		return V;
	}
	
	/**
	 * 
	 * @return the number of vertices in the Edge
	 */
	public int E() {
		return E;
	}
		

	
	 /**
     * Returns a string representation of this graph.
     *
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *         followed by the <em>V</em> adjacency lists
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adjList[v]) {
                s.append(w + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
	 
	 
	// Driver Program
	public static void main (String[] args) {
		
		// Directed Graph 
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
	
		System.out.println(graph);
		
		//Testing AdjList
		LinkedList<Integer> adj = graph.getAdj(2);
		System.out.println(adj);
		System.out.println(graph.V());
		System.out.println(graph.E());
		
		
	}

}
