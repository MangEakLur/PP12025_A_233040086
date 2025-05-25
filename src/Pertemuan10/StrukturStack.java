package Pertemuan10;

public class StrukturStack {

    //  LATIHAN 2: Tambah atribut
    int[] array;
    int capacity;
    int top;

    //  LATIHAN 2: Konstruktor
    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    //  LATIHAN 1: Operasi push
    public void push(int data) {
        if (top < capacity - 1) {
            top++;
            array[top] = data;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    //  LATIHAN 3: isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    //  LATIHAN 3: isFull
    public boolean isFull() {
        return top == capacity - 1;
    }

    //  LATIHAN 3: size
    public int size() {
        return top + 1;
    }

    //  LATIHAN 3: top
    public int top() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Stack kosong!");
            return -1;
        }
    }

    //  TUGAS: Operasi pop
    public int pop() {
        if (!isEmpty()) {
            int data = array[top];
            top--;
            return data;
        } else {
            System.out.println("Stack kosong!");
            return -1;
        }
    }
}
