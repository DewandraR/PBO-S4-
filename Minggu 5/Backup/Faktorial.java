import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int faktorial = 1;
        if (n == 0) {
            faktorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
        }

        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
    }
}
