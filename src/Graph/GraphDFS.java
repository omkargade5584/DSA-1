package Graph;

import java.util.*;

public class GraphDFS {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency List

    // Constructor
    GraphDFS(int vertices) {
        V = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add Edge
    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    // DFS function
    void DFS(int startVertex) {
        boolean[] visited = new boolean[V]; // Track visited nodes
        System.out.print("DFS Traversal: ");
        dfsHelper(startVertex, visited);
    }

    // Helper function for DFS using recursion
    void dfsHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adj[vertex]) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.DFS(0); // Start DFS from vertex 0
    }
}

