package SoalBasicProgramming.Prioritas1;

public class Prioritas1Nomor2 {
    public static void main(String[] args) {
        int hargaBeli = 12000;
        int hargaJual = 12000;

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian

        int untungRugi = hargaJual - hargaBeli;

        if (untungRugi > 0) {
            System.out.println("Untung sebesar: " + untungRugi);
        } else if (untungRugi < 0) {
            System.out.println("Rugi sebesar: -" + (-1 * untungRugi));
        } else {
            System.out.println("Sama saja");
        }
    }
}
