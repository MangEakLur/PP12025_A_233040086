package Pertemuan4;

// Latihan 2 //
public class StrukturList {
    private Node head;

    public StrukturList() {
        this.head = null;
    }

    // Menambahkan node di awal
    public void addFirst(double data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Menambahkan node di akhir
    public void addLast(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }
    
    // Menambahkan node di tengah list pada indeks tertentu
    public void addMid(double data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.getNext();
            count++;
        }

        if (temp == null) {
            System.out.println("Index di luar jangkauan.");
            return;
        }

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
