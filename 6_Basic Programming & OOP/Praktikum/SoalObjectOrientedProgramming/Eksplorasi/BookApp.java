package SoalObjectOrientedProgramming.Eksplorasi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to book management app");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Please choose your menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume new line character

            switch (choice) {
                case 1:
                    System.out.println("Enter title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter category:");
                    String category = scanner.nextLine();
                    Book book = new Book(title, author, category);
                    books.add(book);
                    System.out.println("book created!");
                    System.out.println(book.toString());
                    break;
                case 2:
                    System.out.println("===ALL BOOKS===");
                    for (Book b : books) {
                        System.out.println(b.toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter book ID:");
                    UUID id = UUID.fromString(scanner.nextLine());
                    for (Book b : books) {
                        if (b.getId().equals(id)) {
                            System.out.println(b.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter book ID:");
                    UUID updateId = UUID.fromString(scanner.nextLine());
                    for (Book b : books) {
                        if (b.getId().equals(updateId)) {
                            System.out.println("Enter title:");
                            b.setTitle(scanner.nextLine());
                            System.out.println("Enter author:");
                            b.setAuthor(scanner.nextLine());
                            System.out.println("Enter category:");
                            b.setCategory(scanner.nextLine());
                            System.out.println("book updated!");
                            System.out.println(b.toString());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter book ID:");
                    UUID deleteId = UUID.fromString(scanner.nextLine());
                    for (Book b : books) {
                        if (b.getId().equals(deleteId)) {
                            books.remove(b);
                            System.out.println("book deleted!");
                            break;
                        }
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Bye.....");
                    break;
            }
        }
    }
}
