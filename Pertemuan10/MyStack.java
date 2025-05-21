// Latihan 1 (Postfix): Kelas MyStack turunan dari AbstractStack
package Pertemuan10;

public class MyStack extends AbstractStack {
    private int[] arr;
    private int top;

    public MyStack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    @Override
    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (Bottom --> Top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public int peekN(int n) {
        if (n >= 0 && n <= top) {
            return arr[n];
        } else {
            System.out.println("Index out of bounds");
            return -1;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
}