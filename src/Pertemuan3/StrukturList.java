package Pertemuan3;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Latihan 2 - Menambahkan elemen di akhir list (addTail)
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node temp = HEAD;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }


    // Latihan 5 - Menambahkan elemen di awal list (addHead)
    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD); 
        HEAD = newNode;
    }

    // Latihan 3 - Menampilkan elemen dalam list
    public void displayList() {
        Node temp = HEAD;
        System.out.print("Elemen: ");
        while (temp != null) {
            System.out.print(temp.getData() + " "); 
            temp = temp.getNext(); 
        }
        System.out.println();
    }
}
