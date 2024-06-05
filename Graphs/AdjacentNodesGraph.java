package Graphs;

public class AdjacentNodesGraph {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
       return graph[node1][node2] == 1 ? true : false;
    }
    public static void main(String[] args) {

        int[][] graph = {
            { 0, 1, 0, 1, 1 },
            { 1, 0, 1, 0, 0 },
            { 0, 1, 0, 1, 0 },
            { 1, 0, 1, 0, 1 },
            { 1, 0, 0, 1, 0 }
          };

          int node1 = 1;
          int node2  = 4;
          
        System.out.println(adjacent(graph, node1, node2));
    }
}

// adjacency matrix with an undirected graph
/* 
    0 --------1
  / |         |
 /  |         |
4   |         |
 \  |         |
  \ |         |
   3----------2

*/

// Nodes 0, 3 // true
// Noddes 1, 4 // false