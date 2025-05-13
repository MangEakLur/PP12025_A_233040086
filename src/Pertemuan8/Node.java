package Pertemuan8;
//Latihan-1: Kelas referensi Matakuliah
public class Node {
    private Matakuliah data;
    private Node next;

    public Node(Matakuliah data) {
        this.data = data;
        this.next = null;
    }

    // Getter
    public Matakuliah getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    // Setter
    public void setData(Matakuliah data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
