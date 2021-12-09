package Week_13;

import java.util.*;

class Edge implements Comparable<Edge>{
    //from vertex
    Vertex from;
    //to vertex
    Vertex to;
    //edge weight or cost
    int cost;
    //total number of edges in the graph
    static int totalEdges = 0;

    //constructor
    Edge(Vertex _from, Vertex _to, int _cost){
        this.from = _from;
        this.to = _to;
        this.cost = _cost;
    }

    /*
     *function compares two edges based on their cost
     *Will be used by the priority queue
     */
    @Override
    public int compareTo(Edge e) {
        return (int) (this.cost - e.cost);
    }

    @Override
    public String toString(){
        return this.from.name+"----"+this.from.name;
    }
}


class Vertex{
    //vertex label
    char name;
    List<Edge> edges;
    boolean visited;
    Vertex(char name){
        this.name = name;
        this.visited = false;
        this.edges = new ArrayList<>();
    }
    void connect(Vertex ad_vertex, int edge_cost){
        edges.add(new Edge(this, ad_vertex, edge_cost));
        edges.add(new Edge(ad_vertex, this, edge_cost));
        Edge.totalEdges += 2;
    }
}


class Prims{
    PriorityQueue<Edge> pqueue = new PriorityQueue<>();
    List<Edge> mst = new ArrayList<>();
    int totalCost= 0;
    boolean findMST(Vertex s){
        this.addEdges(s);
        int edgeCount = 0;
        while(!this.pqueue.isEmpty() && edgeCount != Edge.totalEdges){
            //pop the low cost edge from PriorityQueue
            Edge minEdge = this.pqueue.peek();
            this.pqueue.poll();
            if(minEdge.to.visited)
                continue;
            else{
                //increment count and add edge to MST
                edgeCount += 1;
                this.totalCost += minEdge.cost;
                this.mst.add(minEdge);
                this.addEdges(minEdge.to);
            }
        }
        return edgeCount != Edge.totalEdges;
    }

    //function add edges connected with a vertex to the priority queue
    void addEdges(Vertex s){
        s.visited = true;
        for(Edge edge: s.edges){
            if(!edge.to.visited)
                this.pqueue.add(edge);
        }
    }
}

public class Prim {
    public static void main(String[] args) {
        //vertices of the graph
        Vertex vertices[] = {new Vertex('A'), new Vertex('B'), new  Vertex('C'), new Vertex('D'), new Vertex('E')};

        //connecting vertices
        vertices[0].connect(vertices[1], 3);
        vertices[0].connect(vertices[3], 5);
        vertices[1].connect(vertices[2], 2);
        vertices[1].connect(vertices[3], 10);
        vertices[2].connect(vertices[3], 7);
        vertices[2].connect(vertices[4], 8);
        vertices[3].connect(vertices[4], 1);

        //driver code
        Prims prims= new Prims();
        if(prims.findMST(vertices[0])){
            System.out.println(prims.mst);
            System.out.println("Total Cost: "+ prims.totalCost);
        }
        else{
            System.out.println("MST not possible for given graph");
        }
    }
}