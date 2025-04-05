package Graphs;

import java.util.*;

// Breadth First Search
public class BFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // Here Adjancency list is used so O(V+E), if Matrix were used then O(V ^2)

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length]; // visited array
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph, vis); // helper fn
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]) { // BFS - O(n) 
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // src = 0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) { // visit curr
                System.out.print(curr + " "); // Step 1 = Print
                vis[curr] = true; // Step 2 = True
                for (int i = 0; i < graph[curr].size(); i++) { // Step 3 = neighbours add
                    Edge e = graph[curr].get(i);
                    q.add(e.dest); // dest -> neighbour
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
                1 --- 3
               /      | \
              0       |  5 --- 6
               \      | /
                2 --- 4
         */

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);

    }
}
