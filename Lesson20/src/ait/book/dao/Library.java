package ait.book.dao;

import ait.book.model.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity){
        this.books = new Book[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean addBook(Book book){
        if (size >= books.length || findBook(book.getIsbn()) != null){
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    public void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if (isbn == books[i].getIsbn())
                return books[i];
        }
        return null;
    }
    public Book removeBook(long ibsn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == ibsn){
                Book viktim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return viktim;
            }
        }
        return null;
    }

}
