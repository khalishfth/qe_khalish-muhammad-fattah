package SoalObjectOrientedProgramming.Prioritas1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("coffee");
        product1.setDescription("this is coffee");
        product1.setPrice(15000);
        product1.setStock(10);

        Product product2 = new Product();
        product2.setName("milk");
        product2.setDescription("this is fresh milk");
        product2.setPrice(25000);
        product2.setStock(10);

        Product product3 = new Product();
        product3.setName("apple juice");
        product3.setDescription("this is juice");
        product3.setPrice(18000);
        product3.setStock(20);

        product1.getInfo();
        product2.getInfo();
        product3.getInfo();
    }
}
