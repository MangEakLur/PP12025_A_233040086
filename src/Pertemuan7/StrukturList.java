package Pertemuan7;

public class StrukturList {

	private Node head;

    // Setter & Getter untuk head
    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (getHead() == null) {
            setHead(newNode);
        } else {
            Node bantu = getHead();
            while (bantu.getNext() != null) {
                bantu = bantu.getNext();
            }
            bantu.setNext(newNode);
        }
    }

    public void display() {
        Node bantu = getHead();
        if (bantu == null) {
            System.out.println("List Kosong");
            return;
        }
        while (bantu != null) {
            System.out.print(bantu.getData() + " ");
            bantu = bantu.getNext();
        }
        System.out.println();
    }

// Latihan 1 //
    
    public boolean find(int value) {
        Node bantu = getHead();
        while (bantu != null) {
            if (bantu.getData() == value) {
                return true;
            }
            bantu = bantu.getNext();
        }
        return false;
    }

// Latihan 3 //
    
    public int size() {
        int count = 0;
        Node bantu = getHead();
        while (bantu != null) {
            count++;
            bantu = bantu.getNext();
        }
        return count;
    }

    public void clear() {
        setHead(null);
    }
}