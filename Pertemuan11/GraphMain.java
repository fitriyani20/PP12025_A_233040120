package Pertemuan11;

//LATIHAN 5
public class GraphMain {
    public static void main(String[] args) {
        // ====== Graf Pertama ======
        System.out.println("=== latihan 5 ===");
        Graph graph1 = new Graph(5); // 5 simpul: A, B, C, D, E
        graph1.addVertex('A'); // index 0
        graph1.addVertex('B'); // index 1
        graph1.addVertex('C'); // index 2
        graph1.addVertex('D'); // index 3
        graph1.addVertex('E'); // index 4

        graph1.addEdge(0, 1); // A - B
        graph1.addEdge(1, 2); // B - C
        graph1.addEdge(0, 3); // A - D
        graph1.addEdge(3, 4); // D - E

        System.out.println("Adjacency Matrix (Graph 1):");
        graph1.adjacencyMatrix();

        //LATIHAN 6
        // ====== Graf Kedua ======
        System.out.println("\n=== latihan 6 ===");
        Graph graph2 = new Graph(4); // 4 simpul: A, B, C, D
        graph2.addVertex('A'); // index 0
        graph2.addVertex('B'); // index 1
        graph2.addVertex('C'); // index 2
        graph2.addVertex('D'); // index 3

        graph2.addEdge(0, 1); // A - B
        graph2.addEdge(0, 2); // A - C
        graph2.addEdge(0, 3); // A - D
        graph2.addEdge(1, 3); // B - D

        System.out.println("Adjacency Matrix (Graph 2):");
        graph2.adjacencyMatrix();
    }
}