
package Pertemuan9;

public class QueueMain {
	public static void main(String[] args) {
		StrukturQueue sq = new StrukturQueue();
		System.out.println("### Sebelum Enqueue 4x ###");
		sq.displayElement();
		sq.enqueue(2);
		sq.enqueue(7);
		sq.enqueue(6);
		sq.enqueue(1);
		System.out.println("### Sesudah Enqueue 4x ###");
		sq.displayElement();
		sq.dequeue();
		sq.dequeue();
		System.out.println("### Sesudah Dequeue 2x ###");
		sq.displayElement();

	}
}
