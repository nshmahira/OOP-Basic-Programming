public class Balok extends BangunVolume {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;

    }

    @Override
    double Volume() {
        return panjang*lebar*tinggi;
    }
}