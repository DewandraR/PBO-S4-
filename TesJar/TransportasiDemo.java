import Transportasi.*;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Honda Civic", "Putih", 80);
        Bicycle sepeda = new Bicycle("Polygon", "Merah", 20);

        mobil.maju();
        sepeda.maju();
    }
}
