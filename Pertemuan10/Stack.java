package Pertemuan10;

public class Stack {
	    private int capacity;
	    private int[] array;
	    private int TOP;

	    public final int MIN = -1;

	    public Stack(int capacity) {
	        super();
	        this.array = new int[capacity];
	        this.capacity = capacity;
	        this.TOP = MIN;
	    }

	    public boolean isEmpty() {
	        return (TOP == MIN);
	    }

	    public boolean isFull() {
	        return TOP == capacity - 1;
	    }

	    public void push(int data) {
	        if (isFull()) {
	            System.out.println("Stack Penuh");
	        } else {
	            TOP++;
	            array[TOP] = data;
	        }
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Kosong");
	            return -1;
	        } else {
	            return array[TOP--];
	        }
	    }

	    // method size untuk menghitung jumlah elemen dalam stack
	    // dengan cara mengembalikan nilai TOP + 1
	    // karena TOP dimulai dari -1
	    // jika stack kosong, maka TOP = -1
	    // jika stack berisi 1 elemen, maka TOP = 0

	    public int size() {
	        return TOP + 1;
	    }

	    public int peek() {
	        if (isEmpty())
	            return -1;
	        return array[TOP];
	    }

	    public void print() {
	        if (isEmpty()) {
	            System.out.println();
	            return;
	        }
	        for (int i = TOP; i >= 0; i--) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}
