package SoalBasicProgramming.Prioritas2;

public class Prioritas2Nomor2 {
    public static void printAsterisk(int n) {
        // TODO: complete this code
        for (int i = 1; i <= n; i++) {
            // loop untuk mencetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // loop untuk mencetak asterik
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // print baris baru
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAsterisk(5);
    }

}
