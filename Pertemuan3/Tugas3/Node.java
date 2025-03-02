package Pertemuan2;

public class Node {

	    int data; // Atribut untuk menyimpan nilai
	    private Node next; // Pointer ke node berikutnya

	    // Constructor untuk menginisialisasi node dengan nilai tertentu
	    public Node(int data) {
	        this.data = data;
	        this.next = null; // Awalnya next bernilai null
	    }

	    // Setter untuk data
	    public void setData(int data) {
	        this.data = data;
	    }

	    // Getter untuk data
	    public int getData() {
	        return this.data;
	    }

	    // Setter untuk next node
	    public void setNext(Node next) {
	        this.next = next;
	    }

	    // Getter untuk next node
	    public Node getNext() {
	        return this.next;
	    }
}

