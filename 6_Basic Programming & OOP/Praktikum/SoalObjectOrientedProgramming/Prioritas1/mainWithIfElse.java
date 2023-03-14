package SoalObjectOrientedProgramming.Prioritas1;

import java.util.ArrayList;
import java.util.Scanner;

public class mainWithIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat ArrayList produk
        ArrayList<Product> products = new ArrayList<Product>();

        // Looping untuk menampilkan menu
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("MENU");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    // Membuat objek Product baru
                    Product product = new Product();

                    // Memasukkan data produk
                    System.out.print("Nama Produk: ");
                    String name = input.nextLine();
                    product.setName(name);

                    System.out.print("Deskripsi: ");
                    String description = input.nextLine();
                    product.setDescription(description);

                    System.out.print("Harga: ");
                    int price = input.nextInt();
                    product.setPrice(price);

                    System.out.print("Jumlah Stok: ");
                    int stock = input.nextInt();
                    product.setStock(stock);

                    input.nextLine(); // Membersihkan buffer

                    // Menambahkan produk ke dalam ArrayList produk
                    products.add(product);
                    break;

                case "2":
                    // Looping untuk menampilkan informasi produk
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println("===\nINFO PRODUK");
                        System.out.println("nama: " + products.get(i).getName());
                        System.out.println("deskripsi: " + products.get(i).getDescription());
                        System.out.println("harga: " + products.get(i).getPrice());
                        System.out.println("jumlah stok: " + products.get(i).getStock());
                        System.out.println("===");
                    }
                    break;

                case "0":
                    // Keluar dari program
                    isRunning = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
