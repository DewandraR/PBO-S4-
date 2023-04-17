import java.util.Scanner;

public class Karyawan {
    private String nama;
    private int tunjanganAnak;

    public Karyawan(String nama, int tunjanganAnak) {
        this.nama = nama;
        this.tunjanganAnak = tunjanganAnak;
    }

    public String getNama() {
        return nama;
    }

    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTunjanganAnak(int tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Tunjangan Anak: ");
        tunjanganAnak = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Tunjangan Anak: " + tunjanganAnak);
    }
}
