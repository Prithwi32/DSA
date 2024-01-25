package Graph;

import java.util.ArrayList;
import java.util.List;

public class checkGraphIsTree {
    static boolean solve(ArrayList<ArrayList<Integer>> graph, int parent, int curr, boolean visited[]) {
        // mark curr node True
        visited[curr] = true;

        for (int i : graph.get(curr)) {
            // since the graph is bidirectional so we have to avoid to visit parent again
            if (i == parent)
                continue;
            // if the current node is already visited that means cycle is present in the
            // graph
            if (visited[i])
                return false;
            // traverse for rest of the node
            if (!solve(graph, curr, i, visited))
                return false;
        }
        // if cycle is not detected in the graph that means the graph is also a tree
        return true;
    }

    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        // Creating a adjacency matrix from a arraylist
        for (ArrayList<Integer> i : edges) {
            graph.get(i.get(0)).add(i.get(1));
            graph.get(i.get(1)).add(i.get(0));
        }

        boolean visited[] = new boolean[n];
        boolean ans = solve(graph, -1, 0, visited);
        // To check all graph node are connected or not
        for (int i = 0; i < n; i++)
            if (!visited[i])
                return false;

        return ans;
    }

    public static void main(String[] args) {
        // Example usage of isTree method
        int n = 5; // Number of nodes
        int m = 4; // Number of edges

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(List.of(0, 1)));
        edges.add(new ArrayList<>(List.of(0, 2)));
        edges.add(new ArrayList<>(List.of(1, 3)));
        edges.add(new ArrayList<>(List.of(1, 4)));

        checkGraphIsTree obj = new checkGraphIsTree();
        boolean result = obj.isTree(n, m, edges);

        if (result) {
            System.out.println("The graph is a tree.");
        } else {
            System.out.println("The graph is not a tree.");
        }
    }
}
