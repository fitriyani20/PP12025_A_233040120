package Pertemuan8;

public class Node {

	    private Matakuliah Data;
	    private Node Next;
		public Node next;
		public Object data;
	    
	    public Node(Matakuliah Data) {
	        this.Data = Data;
	    }

	    public Matakuliah getData() {
	        return Data;
	    }

	    public void setData(Matakuliah data) {
	        Data = data;
	    }

	    public Node getNext() {
	        return Next;
	    }

	    public void setNext(Node next) {
	        Next = next;
	    }
	}