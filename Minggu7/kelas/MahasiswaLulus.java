package Minggu7;

public class MahasiswaLulus extends Mahasiswa {
    String tanggalLulus;

    public MahasiswaLulus(String nim, String nama, int usia, String tanggalLulus) {
        super(nim, nama, usia);
        this.tanggalLulus = tanggalLulus;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Tanggal Lulus : " + tanggalLulus);
    }
}
