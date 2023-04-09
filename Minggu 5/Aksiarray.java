import java.util.Scanner;

public class Aksiarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int x = sc.nextInt();
        Arrayprototypy ap = new Arrayprototypy(x);
        System.out.println("Masukkan nilai array:");
        ap.setArray();
        System.out.print("Array yang telah diinputkan: ");
        ap.cetak();
        int hasil = ap.hasilKali();
        System.out.println("\nHasil perkalian array: " + hasil);
    }
}