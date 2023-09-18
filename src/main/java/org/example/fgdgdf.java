package org.example;

class MmultiplicationTable {
    public static void main(String[] args) {
        int n = 10; // Задайте диапазон таблицы умножения (от 1 до n)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.print(i + " * " + j + " = " + result + "\t");
            }
            System.out.println(); // Перейти на новую строку после каждой строки таблицы
        }
    }
}
