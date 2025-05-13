package Pertemuan8;

public class ListMkTest {
    public static void main(String[] args) {
        ListMk list = new ListMk();

        // Tambah data
        Matakuliah mk1 = new Matakuliah("IF001", "Algoritma", 3);
        Matakuliah mk2 = new Matakuliah("IF002", "Struktur Data", 4);
        Matakuliah mk3 = new Matakuliah("IF003", "Pemrograman", 3);
        Matakuliah mk4 = new Matakuliah("IF004", "Basis Data", 3);

        // Tes-4: Gunakan addHead, addMid, dan addTail
        list.addHead(mk1);               // Tambah di awal
        list.addTail(mk2);               // Tambah di akhir
        list.addMid(mk3, "IF001");       // Tambah setelah IF001
        list.addTail(mk4);               // Tambah di akhir lagi

        // Tes-1: Tampilkan semua elemen
        list.displayElement();
    }
}