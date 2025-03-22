package Graph;

import java.util.*;

public class GraphBFS {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency List

    // Constructor
    GraphBFS(int vertices) {
        V = vertices;
        adj = new LinkedList[vertices];  //Creates array of linkedlist
        for (int i = 0; i < vertices; i++) {  //For each vertex, it creates an empty linked list to store its neighbors.
            adj[i] = new LinkedList<>();
        }
    }

    // Add Edge
    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    // BFS function
    void BFS(int startVertex) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        // Mark the starting vertex as visited and enqueue it
        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Traverse all adjacent vertices
            for (int neighbor : adj[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.BFS(0); // Start BFS from vertex 0
    }
}

