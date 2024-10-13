package lesson_4;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers1 = new int[5];
        int[] numbers2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = (int) (Math.random() * 100);
            sum1 += numbers1[i];
        }

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) (Math.random() * 100);
            sum2 += numbers2[i];
        }
        System.out.println("Массив 1: " + Arrays.toString(numbers1));
        System.out.println("Массив 2: " + Arrays.toString(numbers2));

        double average1 = (double) sum1 / 5;
        double average2 = (double) sum2 / 5;
        if(average1>average2) {
            System.out.println("Среднее значение первого массива больше второго");
        } else if (average1<average2) {
            System.out.println("Среднее значение второго массива больше первого");
        } else {
            System.out.println("Средние значения равны");


        }
    }
}

