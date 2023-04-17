import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("Menu:");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.print("Pilih menu (1/2): ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nama karyawan: ");
                String nama = input.next();
                System.out.print("Masukkan gaji pokok: ");
                int gajiPokok = input.nextInt();
                System.out.print("Masukkan tunjangan anak: ");
                int tunjanganAnak = input.nextInt();
                
                KaryawanTetap karyawanTetap = new KaryawanTetap(nama, gajiPokok, tunjanganAnak);
                System.out.println("Total gaji karyawan tetap " + karyawanTetap.getNama() + " adalah " + karyawanTetap.totalGaji());
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama karyawan: ");
                String nama = input.next();
                System.out.print("Masukkan upah harian: ");
                int upahHarian = input.nextInt();
                System.out.print("Masukkan jumlah hari masuk: ");
                int jumlahHari = input.nextInt();
                System.out.print("Masukkan tunjangan anak: ");
                int tunjanganAnak = input.nextInt();
                
                KaryawanKontrak karyawanKontrak = new KaryawanKontrak(nama, upahHarian, tunjanganAnak, jumlahHari);
                System.out.println("Total upah karyawan kontrak " + karyawanKontrak.getNama() + " adalah " + karyawanKontrak.totalUpah());
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia.");
            }

            System.out.print("Ingin mengulangi program? (Y/T): ");
            ulangi = input.next();
        } while (ulangi.equalsIgnoreCase("Y"));

        input.close();
    }
}
