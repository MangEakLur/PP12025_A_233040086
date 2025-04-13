package Pertemuan6;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        // Tambahkan elemen: 2, 6, 3, 5, 1
        myList.tambahElemen(2);
        myList.tambahElemen(6);
        myList.tambahElemen(3);
        myList.tambahElemen(5);
        myList.tambahElemen(1);

        // Tampilkan list
        myList.tampilkanList(); // Output: 2 6 3 5 1

        // Hapus elemen tengah (3)
        myList.removeMid();

        // Tampilkan list
        myList.tampilkanList(); // Output: 2 6 5 1

        // Tes tambahan: hapus elemen tengah lagi (5)
        myList.removeMid();

        // Tampilkan list
        myList.tampilkanList(); // Output: 2 1
    }
}

