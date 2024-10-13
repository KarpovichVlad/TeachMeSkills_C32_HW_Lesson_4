package lesson_4;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        double sum = 0;
        int min ;
        int  max  ;

        for( int i = 0; i< numbers.length;i++) {
            numbers[i] = (int) (Math.random() * 100);
            sum += numbers[i];
        }
        max = numbers[0];
        min = numbers[0];
        for(int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double average = sum/size;
        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}




