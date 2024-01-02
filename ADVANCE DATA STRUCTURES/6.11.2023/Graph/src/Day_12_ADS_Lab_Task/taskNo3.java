
package Day_12_ADS_Lab_Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class taskNo3 {
    private int V; // Number of vertices
    private ArrayList<Integer>[] adjacencyList;

    public taskNo3(int vertices) {
        V = vertices;
        adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int from, int to) {
        adjacencyList[from - 1].add(to - 1); // Convert 1-based indexing to 0-based indexing
        adjacencyList[to - 1].add(from - 1); // For undirected graph
    }

    // Depth-First Search (DFS)
    public void dfs(int start, boolean[] visited, ArrayList<Integer> dfsOrder) {
        visited[start] = true;
        dfsOrder.add(start + 1); // Convert 0-based indexing to 1-based indexing

        for (int neighbor : adjacencyList[start]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, dfsOrder);
            }
        }
    }

    // Breadth-First Search (BFS)
    public void bfs(int start, boolean[] visited, ArrayList<Integer> bfsOrder) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            bfsOrder.add(current + 1); // Convert 0-based indexing to 1-based indexing

            for (int neighbor : adjacencyList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of nodes
        int M = scanner.nextInt(); // Number of edges

        taskNo3 graph = new taskNo3(N);

        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        int source = scanner.nextInt(); // Source node

        boolean[] visited = new boolean[N];
        ArrayList<Integer> dfsOrder = new ArrayList<>();
        ArrayList<Integer> bfsOrder = new ArrayList<>();

        graph.dfs(source - 1, visited, dfsOrder);
        visited = new boolean[N]; // Reset visited array for BFS
        graph.bfs(source - 1, visited, bfsOrder);

        // Print DFS order
        for (int node : dfsOrder) {
            System.out.print(node + " ");
        }
        System.out.println();

        // Print BFS order
        for (int node : bfsOrder) {
            System.out.print(node + " ");
        }
        System.out.println();

        scanner.close();
    }
}
