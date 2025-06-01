package Pertemuan11;
//Latihan 6 Update //
public class GraphMainL6 {
 public static void main(String[] args) {
     Graph graph = new Graph(4); // 4 vertex

     graph.addVertex("A"); // index 0
     graph.addVertex("B"); // index 1
     graph.addVertex("C"); // index 2
     graph.addVertex("D"); // index 3

     graph.addEdge(0, 1); // A-B
     graph.addEdge(0, 2); // A-C
     graph.addEdge(0, 3); // A-D
     graph.addEdge(1, 3); // B-D

     graph.adjacencyMatrix();
     System.out.println();
 }
}