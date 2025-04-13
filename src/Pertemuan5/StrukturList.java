package Pertemuan5;

public class StrukturList {
    Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    // Tambah elemen di awal list (digunakan di semua latihan)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Latihan 1: removeHead
    public void removeHead() {
        if (HEAD != null) {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        } else {
            System.out.println("List kosong, tidak bisa hapus head.");
        }
    }

    // Latihan 3: removeTail
    public void removeTail() {
        // Kasus list kosong 
        if (HEAD == null) {
            System.out.println("List kosong, tidak bisa hapus tail.");
            return;
        }

        // Kasus hanya 1 elemen
        if (HEAD.getNext() == null) {
            dispose(HEAD);
            HEAD = null;
            return;
        }

        // Kasus lebih dari 1 elemen
        Node current = HEAD;
        Node prev = null;

        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }

        prev.setNext(null);
        dispose(current);
    }

    // Fungsi bantu untuk menghapus node
    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    // Tampilkan semua elemen list
    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

