package Pertemuan7;

public class StrukturListTest3 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(9);
        list.display();      // Output: 4 3 7 8 1 9
        list.clear();
        list.display();      // Output: List Kosong
    }
}
