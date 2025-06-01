package Pertemuan11;
// Latihan 2 //
import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertexList;
    private int[][] adjacencyMatrix;
    private int count;

    public Graph(int vertexCount) {
        vertexList = new ArrayList<>();
        adjacencyMatrix = new int[vertexCount][vertexCount];
        count = 0;
    }
    // Latihan 3 //
    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
        count++;
    }

    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1; // untuk undirected graph
    }
    // Latihan 4 //
    public void adjacencyMatrix() {
        System.out.print("  ");
        for (int i = 0; i < count; i++) {
            System.out.print(vertexList.get(i).label + " ");
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(vertexList.get(i).label + " ");
            for (int j = 0; j < count; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

