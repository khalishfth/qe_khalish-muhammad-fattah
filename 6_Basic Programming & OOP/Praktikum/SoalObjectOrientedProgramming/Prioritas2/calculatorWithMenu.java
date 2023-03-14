package SoalObjectOrientedProgramming.Prioritas2;

import java.util.Scanner;

public class calculatorWithMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = input.nextInt();
            if (choice == 0) {
                System.out.println("Terima kasih!");
                break;
            }
            int a = 0;
            int b = 0;
            switch (choice) {
                case 1:
                    int[] addInput = getInput(input);
                    a = addInput[0];
                    b = addInput[1];
                    System.out.println("Penjumlahan: " + add(a, b));
                    break;
                case 2:
                    int[] subtractInput = getInput(input);
                    a = subtractInput[0];
                    b = subtractInput[1];
                    System.out.println("Pengurangan: " + subtract(a, b));
                    break;
                case 3:
                    int[] multiplyInput = getInput(input);
                    a = multiplyInput[0];
                    b = multiplyInput[1];
                    System.out.println("Perkalian: " + multiply(a, b));
                    break;
                case 4:
                    int[] divideInput = getInput(input);
                    a = divideInput[0];
                    b = divideInput[1];
                    System.out.println("Pembagian: " + divide(a, b));
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    public static int[] getInput(Scanner input) {
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
        int[] result = {a, b};
        return result;
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
