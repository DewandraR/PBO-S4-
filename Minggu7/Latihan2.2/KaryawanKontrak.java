import java.util.Scanner;

public class KaryawanKontrak extends Karyawan {
    private int upahHarian;
    private int jumlahHari;

    public KaryawanKontrak(String nama, int tunjanganAnak, int upahHarian, int jumlahHari) {
        super(nama, tunjanganAnak);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    public int getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public int totalUpah() {
        return (upahHarian * jumlahHari) + getTunjanganAnak();
    }
}
