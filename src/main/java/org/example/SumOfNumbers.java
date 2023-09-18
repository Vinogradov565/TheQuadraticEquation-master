package org.example;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число N: ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.println("Введите положительное число N.");
        } else {
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);
        }
    }
}
