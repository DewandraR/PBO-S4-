import java.util.Scanner;

public class FMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        Faktorial faktorial = new Faktorial(n);

        System.out.println(n + "! = " + faktorial.getHasil());
    }
}
