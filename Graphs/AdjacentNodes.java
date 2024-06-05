package ET;

public class AdjacentNodes {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
        return graph[node1][node2] == 1;
    }
}

// adjacency matrix within a directed graph, determines if the first node is adjacent to the second one;
