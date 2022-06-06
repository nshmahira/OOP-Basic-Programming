import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        int a = (80);
        if (a >= 80 && a <=100) {
            System.out.println("Student Score A");
        } else if (a >= 65 && a <= 79) {
            System.out.println("Student Score B+");
        } else if (a >= 50 && a <= 64) {
            System.out.println("Student Score B");
        } else if (a >= 35 && a <= 49) {
            System.out.println("Student Score C");
        } else if (a >= 0 && a <= 34) {
            System.out.println("Student Score D");
        } else {
            System.out.println("Invalid Score");
        }

    }
}