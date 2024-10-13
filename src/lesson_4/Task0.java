package lesson_4;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 14, 20,30,99,37,29};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == a) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + a + " присутствует в массиве.");
        } else {
            System.out.println("Число " + a + " отсутствует в массиве.");
        }

    }
}
