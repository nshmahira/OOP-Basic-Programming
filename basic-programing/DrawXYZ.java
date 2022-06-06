import java.util.Scanner;
public class DrawXYZ {
    private static void problemXyz(int height) {
        for (int i = 1; i <= height * height; i++) {
            if (i % 3 ==0){
                System.out.print("X ");
                } else if(i % 2 ==1){
                System.out.print("Y ");
                } else {
                System.out.print ("Z ");
                }
            if(i % height  == 0) {
                System.out.println (" ");
            }
        }
    }
    public static void main(String[] args) {
        problemXyz(3);
    }
}