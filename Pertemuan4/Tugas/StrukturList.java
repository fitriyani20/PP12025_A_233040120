package Tugas;

public class StrukturList {

		
		private Node head;

	    public StrukturList() {
	        this.head = null;
	    }

	    // Tambah elemen di akhir (tail)
	    public void addTail(double data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.getNext() != null) {
	            temp = temp.getNext();
	        }
	        temp.setNext(newNode);
	    }

	    // Tambah elemen di awal (head)
	    public void addHead(double data) {
	        Node newNode = new Node(data);
	        newNode.setNext(head);
	        head = newNode;
	    }

	    // Tambah elemen di posisi tertentu (middle)
	    public void addMid(double data, int position) {
	        Node newNode = new Node(data);
	        if (position == 1 || head == null) {
	            addHead(data);
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; temp != null && i < position - 1; i++) {
	            temp = temp.getNext();
	        }

	        if (temp == null) {
	            System.out.println("Posisi melebihi panjang list.");
	            return;
	        }

	        newNode.setNext(temp.getNext());
	        temp.setNext(newNode);
	    }

	    // Menampilkan isi linked list
	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println();
	    }

}
