package de.neuefische.book;

import java.util.Arrays;

public class Library {
    private final Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Library(int size){
        books = new Book[size];
    }

    public Library(){
        Book book1 = new Book("title", "author", "1234");
        Book book2 = new Book("title2", "author2", "12345");
        books = new Book[10];
        books[0] = book1;
        books[1] = book2;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book){
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public void deleteBookByIsbn(String isbn){
        for(int i = 0; i < books.length; i++){
            if(books[i].getIsbn().equals(isbn)){
                books[i] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
