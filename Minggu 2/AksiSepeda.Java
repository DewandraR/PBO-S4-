public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaBalap = new Sepeda(2, "balap", "Polygon");
        sepedaBalap.gear = 5;
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear " + gearSepeda);
        sepedaBalap.ngerem();

        Sepeda sepedaBayi = new Sepeda(3, "Bayi", "United");
        sepedaBayi.gear = 2;
        int gearSepedaBayi = sepedaBayi.gear;
        System.out.println("Jumlah gear sepeda bayi: " + gearSepedaBayi);
        sepedaBayi.ngerem();
    }
}