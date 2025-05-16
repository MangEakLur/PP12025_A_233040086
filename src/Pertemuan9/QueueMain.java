package Pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // Latihan 4: Enqueue 3x
        queue.enqueue("Data-1");
        queue.enqueue("Data-2");
        queue.enqueue("Data-3");

        // Menampilkan hasil
        System.out.println("Front data: " + queue.front());
        System.out.println("Ukuran Queue: " + queue.size());

        // Latihan 5: Display
        queue.displayElements();

        // Tugas: Dequeue dan cek lagi
        System.out.println(queue.dequeue());
        queue.displayElements();
        System.out.println("Front data: " + queue.front());
        System.out.println("Ukuran Queue: " + queue.size());

        // Tambahan: dequeue lagi
        System.out.println(queue.dequeue());
        queue.displayElements();
    }
}
