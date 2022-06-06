public class Tabung extends BangunVolume{
    double r,t;
    public Tabung (double r, double t){
        this.r = r;
        this.t = t;
    }
    @Override
    double Volume() {
        return 3.14 * (r * r) * t;
    }
}
