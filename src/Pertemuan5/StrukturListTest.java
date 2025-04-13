package Pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);

        list.printList(); // Output: 7 9 2

        list.removeHead();
        list.printList(); // Output: 9 2

        list.removeHead();
        list.removeHead();
        list.printList(); // Output: (kosong)

 //-----------------------------------//
        
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);  // List: 2 6 3 5 1

        list.printList(); // Output: 2 6 3 5 1

        list.removeTail();
        list.printList(); // Output: 2 6 3 5

        list.removeHead();
        list.printList(); // Output: 6 3 5
    }
}

