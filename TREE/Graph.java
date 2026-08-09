import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

    // Function to create a default example graph
    public static List<List<Integer>> createGraph(int v) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Default edges (undirected)
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);

        graph.get(3).add(1);

        return graph;
    }

    // DFS traversal
    public static void dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, visited, neighbor);
            }
        }
    }

    // BFS traversal
    public static void bfs(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Create adjacency list from user input
    public static List<List<Integer>> inputGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int v = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v) pairs (0-indexed):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v1 = sc.nextInt();
            graph.get(u).add(v1);
            graph.get(v1).add(u); // for undirected graph
        }

        sc.close();
        return graph;
    }

    // Print adjacency list
    public static void printAdjacencyList(List<List<Integer>> graph) {
        System.out.println("Adjacency List:");
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Node " + i + ": ");
            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Default example graph
        List<List<Integer>> graph = createGraph(4);

        System.out.println("DFS Traversal starting from node 0:");
        boolean[] visited = new boolean[graph.size()];
        dfs(graph, visited, 0);
        System.out.println();

        System.out.println("BFS Traversal starting from node 0:");
        bfs(graph, 0);
        System.out.println();

        // User input graph
        List<List<Integer>> userGraph = inputGraph();
        printAdjacencyList(userGraph);
    }
}