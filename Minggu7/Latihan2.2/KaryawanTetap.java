import java.util.Scanner;

public class KaryawanTetap extends Karyawan {
    private int gajiPokok;

    public KaryawanTetap(String nama, int tunjanganAnak, int gajiPokok) {
        super(nama, tunjanganAnak);
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int totalGaji() {
        return gajiPokok + getTunjanganAnak();
    }

    public void inputData() {
        super.inputData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = scanner.nextInt();
    }

    public void displayData() {
        super.displayData();
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Gaji: " + totalGaji());
    }
}
