public class Pesawat {
    int sayap;
    int ekor;

    public Pesawat(int sayap, int ekor) {
        this.sayap = sayap;
        this.ekor = ekor;
        System.out.println("Object Pesawat dibuat...........");
    }

    public void terbang() {
        System.out.println("Terbang.............");
    }

    public void mendarat() {
        System.out.println("Mendarat............");
    }
}