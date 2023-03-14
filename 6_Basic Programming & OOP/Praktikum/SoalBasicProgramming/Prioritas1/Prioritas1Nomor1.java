package SoalBasicProgramming.Prioritas1;

public class Prioritas1Nomor1 {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        int luasSegitiga = (int) (0.5f * alas * tinggi);

        System.out.println("Luas segitiga: " + luasSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        //TODO: hitung luas persegi panjang
        int luasPersegiPanjang = (int) (panjang * lebar);

        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        // lingkaran
        double jari2 = 7;

        //TODO: hitung luas lingkaran
        final double phi = 3.14;
        double luasLingkaran = phi * jari2 * jari2;

        System.out.println("Luas lingkaran: " + luasLingkaran);
    }
}
