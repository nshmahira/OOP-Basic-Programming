public class Segitiga extends BangunDatar {
    double alas, tinggi;
    int a = 10;
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
@Override
    double luas() {
        return alas * tinggi/2;
}
@Override
    double keliling() {
        return  alas + tinggi + Math.sqrt( Math.pow(alas,2)+ Math.pow(tinggi,2));
}
}
