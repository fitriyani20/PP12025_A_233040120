package Pertemuan8;

public class StrukturList {

		    private Node HEAD;
		    public boolean isEmpty(){
		        return HEAD == null;
		    }

		    public void addTail(Matakuliah data){
		        Node posNode = null, curNode = null;

		        Node newNode = new Node(data);
		        if(isEmpty()){
		            HEAD = newNode;
		        }
		        else{
		            curNode = HEAD;
		            while(curNode != null){
		                posNode = curNode;
		                curNode = curNode.getNext();
		            }
		            posNode.setNext(newNode);
		        }
		    }

		    public void displayElement(){
		        if(isEmpty()){
		            System.out.println("List Kosong");
		        } else{
		            Node curNode = HEAD;
		            while(curNode != null){
		                Matakuliah mk = curNode.getData();
		                System.out.println("Matakuliah :"+mk.getKode()+" "+mk.getNama()+" "+mk.getSks());
		                curNode = curNode.getNext();
		            }
		            System.out.println("");
		        }
		    }

		    public void addHead(Matakuliah data){
		        Node newNode = new Node(data);
		        if(isEmpty()){
		            HEAD = newNode;
		        }
		        else{
		            newNode.setNext(HEAD);
		            HEAD = newNode;
		        }
		    }

		    public void addMid(Matakuliah data, int position){
		        Node posNode = null, curNode = null;
		        int i;

		        Node newNode = new Node(data);
		        if(isEmpty()){
		            HEAD = newNode;
		        }
		        else{
		            curNode = HEAD;
		            if(position == 1){
		                newNode.setNext(curNode);
		            }else{
		                i = 1;
		                while(curNode != null && i < position){
		                    posNode = curNode;
		                    curNode = curNode.getNext();
		                    i++;
		                }
		                posNode.setNext(newNode);
		                newNode.setNext(curNode);
		            }
		        }
		    }

		    //prosedur remove head
		    public void dispose(Node temp){
		        temp.setNext(null);
		        temp = null;
		    }
		    public void removeHead(){
		        if(isEmpty()){
		            System.out.println("List Kosong");
		        }else{
		            Node temp = HEAD;
		            HEAD = HEAD.getNext();
		            dispose(temp);
		        }
		    }

		    //prosedur remove tail
		    public void disposeTail(Node lastNode){
		        lastNode.setNext(null);
		        lastNode = null;
		    }
		    public void removeTail(){
		        Node preNode = null, lastNode;
		        if(isEmpty()){
		            System.out.println("List Kosong");
		        }else if(HEAD != null){
		            if (HEAD.getNext() == null){
		                HEAD = null;
		            }else{
		                lastNode = HEAD;
		                while (lastNode.getNext() != null){
		                    preNode = lastNode;
		                    lastNode = lastNode.getNext();
		                }
		                preNode.setNext(null);
		                disposeTail(lastNode);
		            }
		        }
		    }

		    //prosedur remove mid
		    public void disposeTemp(Node tempNode){
		        tempNode.setNext(null);
		        tempNode = null;
		    }
		    public void removeMid(Matakuliah e){
		        Node preNode = null, tempNode;
		        int i;
		        boolean ketemu;

		        if (isEmpty()){
		            System.out.println("elemen List Kosong");
		        }else{
		            ketemu = false;
		            i= 1;
		            tempNode =HEAD;
		            while (tempNode.getNext() != null && !ketemu){
		                if (tempNode.getData().equals(e)){
		                    ketemu = true;
		                }else{
		                    preNode = tempNode;
		                    tempNode = tempNode.getNext();
		                    i++;
		                }
		            }
		            if (ketemu == true){
		                if(i == 1){
		                    HEAD = null;
		                }else{
		                    preNode.setNext(tempNode.getNext());
		                    disposeTemp(tempNode);
		                }
		            }
		        }
		    }


		    //fungsi find 
		    public boolean find(Matakuliah x){
		        Node curNode = HEAD;
		        boolean ketemu = false;

		        while(curNode != null && !ketemu){
		            if(curNode.getData().equals(x)){
		                ketemu = true;               
		            }else{
		                curNode = curNode.getNext();
		            }
		        }
		        return ketemu;
		    }

		    //fungsi count
		    public int size(){
		        Node curNode =HEAD;
		        int jumlah =0;

		        while (curNode != null){
		            jumlah++;
		            curNode = curNode.getNext();
		        }
		        return jumlah;
		    }

		    //removeAll
		    public void removeAll(){
		        Node curNode = HEAD;
		        while(curNode != null){
		            Node temp = curNode;
		            curNode = curNode.getNext();
		            dispose(temp);
		        }
		        HEAD = null;
		    }
		}


