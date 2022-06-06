public class Main {
    public static void main(String[] args) {
            BangunVolume bangun_volume = new BangunVolume();
            Kubus Vol_Kubus = new Kubus (10);
            Balok Vol_Balok = new Balok (3,6,10);
            Tabung Vol_Tabung = new Tabung (7,10);
        bangun_volume.Volume();
        System.out.println("Volume Kubus : "+ Vol_Kubus.Volume());
        System.out.println(" ");

        System.out.println("Volume Balok : "+ Vol_Balok.Volume());
        System.out.println(" ");
        System.out.println("Volume Tabung : "+ Vol_Tabung.Volume());
        System.out.println(" ");
    }
}
