package Pertemuan7;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList latihan2 = new StrukturList();
        StrukturList latihan4 = new StrukturList();
        StrukturList tugas = new StrukturList();
        latihan2.addTail(5);
        latihan2.addTail(4);
        latihan2.addTail(6);

        //tampilkan latihan2
        System.out.println("Element: ");
        latihan2.displayElement();
        boolean ketemu = latihan2.find(6);
        //tampilkan true false nya
        System.out.println("\n" + ketemu);

        //tampilkan latihan4
        latihan4.addHead(7);
        latihan4.addTail(4);
        latihan4.addTail(2);
        latihan4.addTail(3);
        latihan4.addMid(6, 2);
        System.out.println("\nElement: ");
        latihan4.displayElement();
        System.out.println("\nJumlah elemen: " + latihan4.size());

        //tugas
        tugas.addHead(4);
        tugas.addTail(8);
        tugas.addTail(1);
        tugas.addTail(9);
        tugas.addMid(3, 2);
        tugas.addMid(7, 3);
        System.out.println("\nElement: ");
        tugas.displayElement();

        tugas.removeAll();
        System.out.println("\nElement setelah di removeAll ");
        tugas.displayElement();
    }
}