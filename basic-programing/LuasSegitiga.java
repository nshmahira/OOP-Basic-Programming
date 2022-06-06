import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner luassegitiga = new Scanner(System.in);
        float alas, tinggi, luas;
        System.out.print("Masukkan Nilai Alas = ");
        alas = luassegitiga.nextInt();
        System.out.print("Masukkan Nilai Tinggi = ");
        tinggi = luassegitiga.nextInt();
        luas = alas*tinggi/2;
        System.out.print("Luas Segitiga Adalah = "+luas+"\n");
    }
}

