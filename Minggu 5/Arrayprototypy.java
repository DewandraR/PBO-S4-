import java.util.Scanner;

public class Arrayprototypy {
    int[] a;

    //constructor
    public Arrayprototypy(int index) {
        a = new int[index];
    }

    public void setArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    public int hasilKali()
    {
        int hasil = 1;
        for (int i = 0; i < a.length; i++) 
            {
                hasil *= a[i];
            }
            return hasil;
    }

    public void cetak() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
