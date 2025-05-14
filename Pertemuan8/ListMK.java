	package Pertemuan8;

	public class ListMK {

		    public static void main(String[] args) {
		        StrukturList list = new StrukturList();
		        StrukturList test1 = new StrukturList();
		        StrukturList tes4 = new StrukturList();

		        list.addHead(new Matakuliah("IF001, ", "Dasar Pemrograman, ", 3));
		        list.addHead(new Matakuliah("IF002, ", "Basis Data, ", 3));
		        list.displayElement();

		        test1.addHead(new Matakuliah("IF004, ", "Konstruksi PL Berorientasi Objek, ", 3));
		        test1.addHead(new Matakuliah("IF003, ", "Struktur Dekrit, ", 3));
		        test1.addHead(new Matakuliah("IF002, ", "Pemrograman Web, ", 3));
		        test1.addHead(new Matakuliah("IF001, ", "Dasar Pemrograman, ", 4));
		        test1.displayElement();
		        
		        tes4.addTail(new Matakuliah("IF002, ", "Pemrograman Web, ", 3));
		        tes4.addTail(new Matakuliah("IF001, ", "Dasar Pemrograman, ", 4));
		        tes4.addHead(new Matakuliah("IF004, ", "Konstruksi PL Berorientasi Objek, ", 3));
		        tes4.addMid(new Matakuliah("IF003, ", "Struktur Dekrit, ", 3), 2);
		        tes4.displayElement();
		    }
		}


