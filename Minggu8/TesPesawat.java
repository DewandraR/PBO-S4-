public class TesPesawat {
    public static void main(String[] args) {
        Pesawat pesawat1 = new Pesawat(2, 1);
        pesawat1.terbang();

        Pesawat pesawat2 = new Pesawat(2, 1);
        pesawat2.terbang();

        PesawatTempur pesawatTempur = new PesawatTempur(2, 1);
        pesawatTempur.terbang();
        pesawatTempur.manuver();

        pesawatTempur.mendarat();
    }
}