// Latihan 4: Program utama untuk menguji StrukturStack
package Pertemuan10;

public class StrukturStackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.print("Elemen from TOP: ");
        stack.print();
        System.out.println();

        System.out.println("#Melakukan push 3x:");
        System.out.println("push 2; push 4, push 1");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.print("Elemen from TOP: ");
        stack.print();

        System.out.println("#Melakukan POP 1x:");
        stack.pop();
        System.out.print("Elemen from TOP: ");
        stack.print();
        System.out.println("Size: " + stack.size());

        System.out.println("#Melakukan POP 1x:");
        stack.pop();
        System.out.print("Elemen from TOP: ");
        stack.print();
        System.out.println("Size: " + stack.size());
    }
}