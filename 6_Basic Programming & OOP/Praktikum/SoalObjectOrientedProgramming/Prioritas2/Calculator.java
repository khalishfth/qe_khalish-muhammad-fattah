package SoalObjectOrientedProgramming.Prioritas2;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Penjumlahan: " + add(3, 4));
        System.out.println("Pengurangan: " + subtract(15, 4));
        System.out.println("Perkalian: " + multiply(10, 10));
        System.out.println("Pembagian: " + divide(12, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
