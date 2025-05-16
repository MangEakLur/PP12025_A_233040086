package Pertemuan9;

public class StrukturQueue {
    Node front, rear;

    // Latihan 1: Enqueue
    public void enqueue(String data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Latihan 2: isEmpty
    public boolean isEmpty() {
        return front == null;
    }

    // Latihan 3: size dan front
    public int size() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public String front() {
        if (front == null) {
            return "Queue kosong";
        } else {
            return front.data;
        }
    }

    // Latihan 5: displayElements
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            Node temp = front;
            System.out.print("Elemen dalam Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Tugas: Dequeue
    public String dequeue() {
        if (isEmpty()) {
            return "Queue kosong, tidak bisa dequeue.";
        } else {
            String removed = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return "Data yang dikeluarkan: " + removed;
        }
    }
}
