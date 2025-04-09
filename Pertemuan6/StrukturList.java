package Pertemuan6;

public class StrukturList {

	    Node HEAD = null;
	    
	    public void addTail(int data) {
	        Node curNode = null;
	        Node posNode = null;
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            curNode = HEAD;
	            while (curNode.getNext() != null) {
	                curNode = curNode.getNext();
	            }
	            curNode.setNext(newNode);
	        }
	    }

	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    public void displayElement() {
	        Node curNode = HEAD;
	        while (curNode != null) {
	            System.out.print(curNode.data + " ");
	            curNode = curNode.getNext();
	        }
	    }
	    
	    public void addHead (int data){
	        Node newNode = new Node(data);
	        if (isEmpty()){
	            HEAD = newNode;
	        } else {
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        }
	    }
	    
	    public void addMid(int data, int position) {
	        Node newNode = new Node(data);
	        
	        if (HEAD == null) {
	            HEAD = newNode;
	            return;
	        }
	        
	        if (position == 1) { // Tambah di awal
	            newNode.next = HEAD;
	            HEAD = newNode;
	            return;
	        }
	        
	        Node curNode = HEAD;
	        Node posNode = null;
	        int i = 1;
	        
	        while (curNode != null && i < position) {
	            posNode = curNode;
	            curNode = curNode.next;
	            i++;
	        }
	        
	        if (posNode != null) {
	            posNode.next = newNode;
	            newNode.next = curNode;
	        }
	    }
	    
		public void removeHead() {
			if (isEmpty()) {
				System.out.println("List Kosong");
			} else {
				Node temp = HEAD;
				HEAD = HEAD.getNext();
				dispose(temp);
			}
		}

		private void dispose(Node temp) {
			temp.setNext(null);
			temp = null;
		}
		
		public void removeTail() {
			Node preNode = null, LastNode;
			if (HEAD != null) {
				if (HEAD.getNext() == null) {
					HEAD = null;
				} else {
					LastNode = HEAD;
					while (LastNode.getNext() != null) {
						preNode = LastNode;
						LastNode = LastNode.getNext();
					}
					preNode.setNext(null);
					dispose(LastNode);
				}
			} else {
				System.out.println("List Kosong");
			}
		}

		//LATIHAN 1
		public void removeMid(int e) {
			Node preNode = new Node(0);
			Node tempNode;
			int i;
			boolean ketemu;
			
			if (isEmpty()) {
				System.out.println("Elemen List Kosong");
			} else {
				ketemu = false;
				i = 1;
				tempNode = HEAD;

				while (tempNode.getNext() != null && !ketemu) {
					if (tempNode.getNilai() == e) {
						ketemu = true;
					} 
					else {
						preNode = tempNode;
						tempNode = tempNode.getNext();
						i++;
					}
				}

				if (ketemu == true) {
					if (i == 1) {
						HEAD = null;
					} else {
						preNode.setNext(tempNode.getNext());
						dispose(tempNode);
					}
				} 
			}
		}
	}
