// Latihan 1-3, Tugas
package Pertemuan10;

public class StrukturStack {
    private Stack stack; // Latihan 2: Menggunakan kelas Stack sebagai struktur internal

    // Latihan 2: Konstruktor menerima parameter kapasitas
    public StrukturStack(int capacity) {
        stack = new Stack(capacity);
    }

    // Latihan 1: Operasi push
    public void push(int data) {
        stack.push(data);
    }

    // Tugas: Operasi pop
    public int pop() {
        return stack.pop();
    }

    // Latihan 3: Mengecek apakah stack kosong
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Latihan 3: Mengecek apakah stack penuh
    public boolean isFull() {
        return stack.isFull();
    }

    // Latihan 3: Mendapatkan ukuran stack
    public int size() {
        return stack.size();
    }

    // Latihan 3: Mengambil nilai TOP
    public int getTop() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    // Tambahan: Menampilkan isi stack dari TOP ke bawah
    public void print() {
        stack.print();
    }
}