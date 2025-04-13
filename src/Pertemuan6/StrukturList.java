package Pertemuan6;

import java.util.ArrayList;

public class StrukturList {
    ArrayList<Integer> list = new ArrayList<>();

    // Menambahkan elemen ke list
    public void tambahElemen(int elemen) {
        list.add(elemen);
    }

    // Menampilkan elemen list
    public void tampilkanList() {
        for (int elemen : list) {
            System.out.print(elemen + " ");
        }
        System.out.println();
    }

    // Menghapus elemen tengah dari list
    public void removeMid() {
        if (!list.isEmpty()) {
            int midIndex = list.size() / 2;
            list.remove(midIndex);
        }
    }
}

