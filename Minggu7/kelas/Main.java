package Minggu7;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("INI CLASS Mahasiswa");
        System.out.println("================================================");
        Mahasiswa mhs = new Mahasiswa("13307", "Dewandra", 19);
        mhs.cetak();
        System.out.println("================================================");
        System.out.println("INI CLASS MahasiswaAktif");
        System.out.println("================================================");
        MahasiswaAktif mhs2 = new MahasiswaAktif("13307", "Dewandra", 19, 4);
        mhs2.cetak();
        System.out.println("================================================");
        System.out.println("INI CLASS MahasiswaLulus");
        System.out.println("================================================");
        MahasiswaLulus mhs3 = new MahasiswaLulus("13307", "Dewandra", 19, "11/04/2023");
        mhs3.cetak();
    }
}
