public class Kubus extends BangunVolume{
    double sisi;
    public Kubus (double sisi){
        this.sisi = sisi;
    }
    @Override //metode turunan
    double Volume(){
        return sisi * sisi * sisi;
    }



}
