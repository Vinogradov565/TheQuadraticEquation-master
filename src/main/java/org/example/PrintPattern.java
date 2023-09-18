package org.example;

public class PrintPattern {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("# ");
            }
            System.out.println(); // Перейти на следующую строку после вывода каждой строки решеток
        }
    }
}
