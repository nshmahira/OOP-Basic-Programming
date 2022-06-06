public class Mean {
    private static float MeanArray (float[] number) {
        float sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        float rata = sum / number.length;
        return rata;
    }
    public static void main(String[] args) {
        float [] array = {1, 2 , 3 , 4 ,5};
        System.out.println("rata-rata dari bilangan tersebut adalah : " +MeanArray(array));

    }
}
