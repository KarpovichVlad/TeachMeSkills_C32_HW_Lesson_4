package lesson_4;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Введите число для удаления: ");
        int numberToDelete = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == numberToDelete) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Число " + numberToDelete + " не найдено в массиве.");
        } else {
            int[] newNumbers = new int[numbers.length - count];
            int newIndex = 0;

            for (int number : numbers) {
                if (number != numberToDelete) {
                    newNumbers[newIndex++] = number;
                }
            }

            System.out.print("Новый массив без числа " + numberToDelete + ": ");
            System.out.println(Arrays.toString(newNumbers));
        }

    }
}
