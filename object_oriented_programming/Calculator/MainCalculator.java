import java.util.Scanner;

public class MainCalculator extends operator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        operator Operator = new operator();

        System.out.print ("Input angka pertama : ");
        double angka1 = Double.parseDouble(input.nextLine());
        System.out.print("Input angka kedua : ");
        double angka2 = Double.parseDouble(input.nextLine());
        System.out.print("Pilih Operator (+,-,*,/) : ");
        String op = input.nextLine();
switch (op) {
    case "+":
        System.out.println("Hasil Pertambahan = " + Operator.pertambahan(angka1,angka2));
        break;
    case "-":
        System.out.println("Hasil Pengurangan = " + Operator.pengurangan(angka1,angka2));
        break;
    case "*":
        System.out.println("Hasil Perkalian = " + Operator.perkalian(angka1,angka2));
        break;
    case "/":
        System.out.println("Hasil Pembagian = " + Operator.pembagian(angka1,angka2));
        break;

}
    }
}
