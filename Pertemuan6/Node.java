package Pertemuan6;

class Node {
        int data;
        Node next;

		

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

		public int getNilai() {
			return data;
        }
}