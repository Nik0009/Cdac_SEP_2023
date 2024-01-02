
package Day_12_ADS_Lab_Task;


//Q2. An undirected graph represented as an adjacency list. The
//task is to implement two different graph traversal algorithms:
//Depth-First Search (DFS) and Breadth-First Search (BFS). The
//goal is to visit all nodes in the graph and print the order in which
//the nodes are visited.



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class taskNo2 {
    private int V; 
    private ArrayList<Integer>[] adjacencyList;

    public taskNo2(int vertices) {
        V = vertices;
        adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    
    public void addEdge(int from, int to) {
        adjacencyList[from].add(to);
        adjacencyList[to].add(from); 
    }

    
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                System.out.print(current + " ");
                visited[current] = true;

                for (int neighbor : adjacencyList[current]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

   
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (!visited[current]) {
                System.out.print(current + " ");
                visited[current] = true;

                for (int neighbor : adjacencyList[current]) {
                    if (!visited[neighbor]) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        taskNo2 graph = new taskNo2(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS Order:");
        graph.dfs(0);
        System.out.println();

        System.out.println("BFS Order:");
        graph.bfs(0);
        System.out.println();
    }
}

