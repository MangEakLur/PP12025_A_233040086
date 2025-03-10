package Pertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        // Tugas 2a //
        list.addLast(3.4);
        list.addLast(4.5);
        list.addMid(2.1, 0);
        list.display(); // Output: 2.1 3.4 4.5
        // Tugas 2b //
        list = new StrukturList(); // Reset list baru
        list.addLast(3.4);
        list.addMid(2.1, 1); // Menambahkan 2.1 setelah 3.4
        list.addMid(1.1, 2); // Menambahkan 1.1 setelah 2.1
        list.addLast(4.5);
        list.addLast(5.5);
        list.display(); // Ouput : 3.4 2.1 1.1 4.5 5.5
        
        //Latihan 3//
        list = new StrukturList();
        list.addFirst(5);
        list.addLast(3);
        list.addLast(8);
        list.addLast(7);
        list.addLast(4);
        list.display(); // Output: 5 3 8 7 4
    }
}