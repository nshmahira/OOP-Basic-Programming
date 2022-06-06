public class KelilingPersPanjang {
    public static void main(String[] args) {
        BangunDatar bangun_datar = new BangunDatar();
        PersegiPanjang persegi_panjang = new PersegiPanjang(7,8);
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga (3,4);
//Persegi Panjang
        bangun_datar.luas();
        System.out.println("Luas Persegi Panjang : "+ persegi_panjang.luas());
        bangun_datar.keliling ();
        System.out.println("Keliling Persegi Panjang : "+ persegi_panjang.keliling());
        System.out.println(" ");
//Persegi

        bangun_datar.luas();
        System.out.println("Luas Persegi  : "+ persegi.luas());
        bangun_datar.keliling ();
        System.out.println("Keliling Persegi : "+ persegi.keliling());

//segitiga
        System.out.println(" ");
        bangun_datar.luas();
        System.out.println("Luas Segitiga  : "+ segitiga.luas());
        bangun_datar.keliling ();
        System.out.println("Keliling Segitiga : "+ segitiga.keliling());
    }

}
