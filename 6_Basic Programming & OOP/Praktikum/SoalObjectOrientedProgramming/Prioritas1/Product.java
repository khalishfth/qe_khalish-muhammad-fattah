package SoalObjectOrientedProgramming.Prioritas1;

public class Product {
    private String name;
    private String description;
    private int price;
    private int stock;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void getInfo() {
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama: " + getName());
        System.out.println("deskripsi: " + getDescription());
        System.out.println("harga: " + getPrice());
        System.out.println("jumlah stok: " + getStock());
        System.out.println("===");
    }
}
