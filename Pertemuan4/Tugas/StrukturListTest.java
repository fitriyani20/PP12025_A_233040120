package Tugas;

public class StrukturListTest {
		
		public static void main(String[] args) {
	        
	        System.out.println("Output a:");
	        StrukturList listA = new StrukturList();
	        listA.addHead(2.1);  
	        listA.addTail(4.5);  
	        listA.addMid(3.4, 2); 
	        listA.display(); //
	     
	        System.out.println("\nOutput b:");
	        StrukturList listB = new StrukturList();
	        listB.addHead(2.1);  
	        listB.addHead(3.4);  
	        listB.addTail(4.5);  
	        listB.addTail(5.5);  
	        listB.addMid(1.1, 3); 
	        listB.display(); 
	    }

}
