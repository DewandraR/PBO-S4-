public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        int hasilPertambahan = matematika.pertambahan(5, 3);
        System.out.println("Hasil Pertambahan (int): " + hasilPertambahan);

        double hasilPertambahanPecahan = matematika.pertambahan(12.5, 28.7, 14.2);
        System.out.println("Hasil Pertambahan (double): " + hasilPertambahanPecahan);

        int hasilPengurangan = matematika.pengurangan(5, 3);
        System.out.println("Hasil Pengurangan (int): " + hasilPengurangan);

        double hasilPenguranganPecahan = matematika.pengurangan(12.5, 28.7, 14.2);
        System.out.println("Hasil Pengurangan (double): " + hasilPenguranganPecahan);

        int hasilPerkalian = matematika.perkalian(5, 3);
        System.out.println("Hasil Perkalian (int): " + hasilPerkalian);

        double hasilPerkalianPecahan = matematika.perkalian(12.5, 28.7, 14.2);
        System.out.println("Hasil Perkalian (double): " + hasilPerkalianPecahan);

        int hasilPembagian = matematika.pembagian(5, 3);
        System.out.println("Hasil Pembagian (int): " + hasilPembagian);

        double hasilPembagianPecahan = matematika.pembagian(12.5, 28.7, 14.2);
        System.out.println("Hasil Pembagian (double): " + hasilPembagianPecahan);
    }
}

