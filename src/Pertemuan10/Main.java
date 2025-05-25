package Pertemuan10;

public class Main {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Push 3 elemen
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Uji operasi stack
        System.out.println("Apakah stack penuh? " + stack.isFull());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
        System.out.println("Ukuran stack: " + stack.size());
        System.out.println("Elemen teratas: " + stack.top());

        // Uji operasi pop
        System.out.println("Pop elemen: " + stack.pop());
        System.out.println("Elemen teratas sekarang: " + stack.top());
        System.out.println("Ukuran stack sekarang: " + stack.size());
    }
}

