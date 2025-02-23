package Pertemuan3;

public class ListTest {
    public static void main(String[] args) {
        // Latihan 4 - Pengujian addTail
        System.out.println("Latihan 4:");
        StrukturList list1 = new StrukturList();
        list1.addTail(3);
        list1.addTail(4);
        list1.addTail(5);
        list1.displayList();  // Output: Elemen: 3 4 5

        // Tes-1 (a) -> Output: 3 2 1
        System.out.println("Tes-1a:");
        StrukturList list2 = new StrukturList();
        list2.addTail(3);
        list2.addTail(2);
        list2.addTail(1);
        list2.displayList();

        // Tes-1 (b) -> Output: 1 4 5 7
        System.out.println("Tes-1b:");
        StrukturList list3 = new StrukturList();
        list3.addTail(1);
        list3.addTail(4);
        list3.addTail(5);
        list3.addTail(7);
        list3.displayList();

        // Latihan 5 - Pengujian addHead
        System.out.println("Latihan 5:");
        StrukturList list4 = new StrukturList();
        list4.addHead(5);
        list4.addHead(4);
        list4.addHead(3);
        list4.displayList();  // Output: Elemen: 3 4 5

        // Tes-2 (a) -> Output: 3 2 1
        System.out.println("Tes-2a:");
        StrukturList list5 = new StrukturList();
        list5.addHead(1);
        list5.addHead(2);
        list5.addHead(3);
        list5.displayList();

        // Tes-2 (b) -> Output: 1 4 5 7
        System.out.println("Tes-2b:");
        StrukturList list6 = new StrukturList();
        list6.addHead(7);
        list6.addHead(5);
        list6.addHead(4);
        list6.addHead(1);
        list6.displayList();
    }
}
