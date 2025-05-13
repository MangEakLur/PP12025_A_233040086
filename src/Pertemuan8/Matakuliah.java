package Pertemuan8;
//Latihan-1: Node menyimpan data tipe Matakuliah
public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Setter
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void display() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", SKS: " + sks);
    }
}

