package Graph;

import java.util.*;

// Graph class using adjacency list
class GraphAdjacencyList {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjacencyList; // Adjacency List

    // Constructor
    public GraphAdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        // Initialize adjacency lists for all vertices
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add Edge (Undirected Graph)
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source); // Comment this for directed graph
    }

    // Print Graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Integer node : adjacencyList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList graph = new GraphAdjacencyList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}

