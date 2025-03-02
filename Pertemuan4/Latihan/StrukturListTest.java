package latihan;

public class StrukturListTest {

		
		 public static void main(String[] args) {
			 
		        StrukturList list = new StrukturList();

		        // 1. Create list
//		        list.addTail(5); 
		        // 2. Tambah elemen 3 di akhir list
		        list.addTail(3); 
		        // 3. Tambah elemen 4 di akhir list
		        list.addTail(4); 
		        // 4. Tambah elemen 7 di index 2
		        list.addMid(7, 2); 
		        // 5. Tambah elemen 8 di index 2
		        list.addMid(8, 2); 
		        // 6. Tambah elemen 5 di awal list
		        list.addHead(5); 
		        // 7. Tampilkan elemen list
		        list.display(); 
		    }
	}

