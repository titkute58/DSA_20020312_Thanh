package Week_12;

import java.util.LinkedList;
import java.util.Scanner;


public class BFS_ShortestReach {
    private static class Graph {
        private int v;
        private LinkedList<Integer> adj[];

        public Graph(int v) {
            this.v = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adj[i] = new LinkedList<>();
        }
        public void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v);
        }
        public void bfs(int u, int[] d) {
            boolean visited[] = new boolean[v];
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[u] = true;
            d[u] =0;
            queue.add(u);
            while (!queue.isEmpty()) {
                u = queue.poll();
                //System.out.print(u+" ");
                for(int x : adj[u]) {
                    if(!visited[x]){
                        d[x] = d[u]+1;
                        visited[x] = true;
                        queue.add(x);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int q = inp.nextInt();
        for(int i=1;i<=q;i++) {

            int m = inp.nextInt();
            int n = inp.nextInt();
            Graph g = new Graph(m+1);
            for(int j=1;j<=n;j++) {
                int u = inp.nextInt();
                int v = inp.nextInt();
                g.addEdge(u,v);
            }
            int s = inp.nextInt();
            int[] d = new int[m+1];
            for(int j=1;j<=m;j++)
                d[j] =-1;
            g.bfs(s,d);
            for(int j=1;j<=m;j++){
                if(d[j]==-1){
                    System.out.print("-1 ");
                } else if (d[j]!=0){
                    System.out.print((d[j]*6) + " ");
                }
            }
            System.out.println();
        }
    }
}