package de.neuefische;

import de.neuefische.book.Book;
import de.neuefische.book.Library;
import de.neuefische.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "I4");
        System.out.println(car.getBrand());
        System.out.println(car);
        Car car2 = new Car("BMW", "I3");
        boolean isEqualsCar = car.equals(car2);
        System.out.println(isEqualsCar);

        System.out.println();
        System.out.println();

        Book book1 = new Book("title", "author", "1234");
        Book book2 = new Book("title2", "author2", "12345");
        Book book3 = new Book("title3", "author3", "123456");

        Book[] books = {book1, book2, book3};
        Library library = new Library();
        Library library1 = new Library(books);

        System.out.println(library);
        System.out.println(library1);

        System.out.println();
        System.out.println();

        Library library2 = new Library(10);
        library2.addBook(new Book("test-buch", "test-author", "123456789"));
        System.out.println(library2);
        library2.addBook(book2);
        System.out.println(library2);
        library2.deleteBookByIsbn("123456789");
        System.out.println(library2);
    }
}
