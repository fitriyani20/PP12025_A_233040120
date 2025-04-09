package Pertemuan6;

public class StrukturListTest {


	    public static void main(String[] args) {
	        StrukturList list = new StrukturList();
	  //LATIHAN 2
	        list.addTail(2);
	        list.addTail(6);
	        list.addTail(3);
	        list.addTail(5);
	        list.addTail(1);
	        list.displayElement();
	        System.out.println();
	        list.removeMid(3);
	        list.displayElement();
	        System.out.println();
	        list.removeMid(6);
	        list.displayElement();
	        System.out.println();
	        list.removeMid(5);
	        list.displayElement();
	        
	    }
	}
