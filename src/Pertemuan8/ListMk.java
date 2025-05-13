package Pertemuan8;

public class ListMk {
    private Node head;

    public ListMk() {
        head = null;
    }

    // Tes-2 dan latihan 2: addTail menggunakan kelas Matakuliah
    public void addTail(Matakuliah mk) {
        Node newNode = new Node(mk);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // Tes-3: addMid menggunakan kelas Matakuliah
    public void addMid(Matakuliah mk, String kodeSebelum) {
        Node temp = head;
        while (temp != null && !temp.getData().getKode().equals(kodeSebelum)) {
            temp = temp.getNext();
        }
        if (temp != null) {
            Node newNode = new Node(mk);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }

    // Latihan 5 Tambahan: addHead
    public void addHead(Matakuliah mk) {
        Node newNode = new Node(mk);
        newNode.setNext(head);
        head = newNode;
    }

    // Tes-1 dan latihan 3: displayElement menampilkan isi list
    public void displayElement() {
        Node temp = head;
        while (temp != null) {
            temp.getData().display();
            temp = temp.getNext();
        }
    }
}
