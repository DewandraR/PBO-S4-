package Minggu7;

public class Mahasiswa {
    String nim;
    String nama;
    int usia;

    // constructor
    public Mahasiswa(String nim, String nama, int usia) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
    }

    public void cetak() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
}
