class PesawatTempur extends Pesawat {
    public PesawatTempur(int sayap, int ekor) {
        super(sayap, ekor);
        System.out.println("Object Pesawat Tempur dibuat...........");
    }

    public void manuver() {
        System.out.println("Manuver.........*");
    }

    @Override
    public void terbang() {
        System.out.println("Terbang ala tempur........");
    }
}
