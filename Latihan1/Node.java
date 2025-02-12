package Pertemuan1;

public class Node {

	private int Nilai;
	private Node Next;
	
	//inisialisasi node
	
	public Node (int Nilai) {
		this.Nilai = Nilai;
	}
	
	//inisialisasi Node
	public void setnilai (int Nilai) {
		this.Nilai = Nilai;
	}
	
	//setter & getter
	
	//setter
	public void setNilai (int Nilai) {
		this.Nilai = Nilai;
	}
	
	//getter
	public int getNilai() {
		return Nilai;
	}
	
	//setter untuk next node
	public void setNext (Node Next) {
		this.Next = Next;
	}
	
	//getter untuk next node
	public Node getNext() {
		return Next;
	}
	
	
}
