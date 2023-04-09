public class Faktorial {
    private int n;
    private int hasil;

    public Faktorial(int n) {
        this.n = n;
        hitungFaktorial();
    }

    public int getHasil() {
        return hasil;
    }

    private void hitungFaktorial() {
        hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
    }
}
