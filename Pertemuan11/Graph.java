package Pertemuan11;

//LATIHAN 2
	public class Graph {
	    private Vertex vertexList[]; // array untuk menyimpan vertex
	    private int adjMat[][]; // array untuk menyimpan adjacency matrix
	    private int nVerts; // jumlah vertex saat ini
	    // edge adalah hubungan antar vertex, vertex adalah simpul dalam graf

	    public Graph(int maxVerts) {
	        vertexList = new Vertex[maxVerts]; // Inisialisasi daftar vertex
	        adjMat = new int[maxVerts][maxVerts]; // Inisialisasi matriks ketetanggaan
	        nVerts = 0; // Mulai dengan tidak ada vertex
	        for (int i = 0; i < maxVerts; i++) {
	            for (int j = 0; j < maxVerts; j++) {
	                adjMat[i][j] = 0; // Set semua edge ke nol
	            }
	        }
	    }
//---------------------------------------------------------------------LATIHAN 2
	    
	    //LATIHAN 3
	    // Metode untuk menambahkan vertex ke graf
	    public void addVertex(char label) {
	        vertexList[nVerts++] = new Vertex(label); // Tambahkan vertex baru
	    }

	    // Metode untuk menambahkan edge antara dua vertex
	    public void addEdge(int start, int end) {
	        adjMat[start][end] = 1; // Set edge dari start ke end
	        adjMat[end][start] = 1; // Karena graf tidak berarah, set juga sebaliknya
	    }
//----------------------------------------------------------------------------------------LATIHAN 3
	    
	    //LATIHAN 4
	    // Metode operasi adjacency matrix
	    public void adjacencyMatrix() {
	        for (int i = 0; i < adjMat.length; i++) {
	            for (int j = 0; j < adjMat[i].length; j++) {
	                System.out.print(adjMat[i][j] + " "); // Cetak nilai edge
	            }
	            System.out.println(); // Pindah ke baris berikutnya
	        }
	    }
	}
