package Week_13;

import java.util.*;

public class PrimMST {
    private static class Cost implements Comparable<Cost> {
        public int r, v;
        public Cost(int vertex, int cost) {
            r = cost;
            v = vertex;
        }
        @Override
        public int compareTo(Cost c) {
            if (r < c.r) return -1;
            if (r> c.r) return 1;
            return Integer.compare(v, c.v);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();

        List<List<Cost>> vertices = new ArrayList<>(vertex + 1);
        for (int i = 0; i <= vertex; i++) {
            vertices.add(new ArrayList<>());
        }

        int edge = sc.nextInt();

        for (int i = 0; i < edge; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int weight = sc.nextInt();
            vertices.get(from).add(new Cost(to, weight));
            vertices.get(to).add(new Cost(from, weight));
        }

        int start = sc.nextInt();
        sc.close();

        System.out.println(PrimMST(vertex, vertices, start));

    }

    private static int PrimMST(int vertex, List<List<Cost>> vertices, int start) {
        int sum = 0;
        List<Integer> vertexTrace = new ArrayList<>();    // contains added vertex in graph
        List<Cost> edgeTrace = new ArrayList<>();       // contains added edge in graph

        vertexTrace.add(start);
        PriorityQueue<Cost> pq = new PriorityQueue<>();
        while (edgeTrace.size() < vertex - 1) {
            for (Cost j : vertices.get(start)) {
                if (!vertexTrace.contains(j.v) && !edgeTrace.contains(j)) {
                    pq.add(j);
                }
            }

            Cost tmp = pq.poll();
            if (tmp != null && !vertexTrace.contains(tmp.v) && !edgeTrace.contains(tmp)) {
                sum += tmp.r;
                vertexTrace.add(tmp.v);
                start = tmp.v;
                edgeTrace.add(tmp);
            }
        }

        return sum;
    }
}
