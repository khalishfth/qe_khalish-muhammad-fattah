package SoalBasicProgramming.Prioritas2;

public class Prioritas2Nomor1 {
    public static void drawXYZ(int height) {
        //TODO: complete this code
        int counter = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                counter++;
                if (counter % 3 == 0) {
                    System.out.print("X ");
                } else if (counter % 2 == 1) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }

}
