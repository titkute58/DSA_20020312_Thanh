package Week_13;

public class GraphAdjacencyMatrix {
    private boolean matrix[][];
    private int vertex;

    // Initialize the matrix
    public GraphAdjacencyMatrix(int numVertices) {
        this.vertex = numVertices;
        matrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j) {
        matrix[i][j] = true;
        matrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        matrix[i][j] = false;
        matrix[j][i] = false;
    }

    public void printGraph() {
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 0; j <vertex ; j++) {
                if(matrix[i][j]){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}