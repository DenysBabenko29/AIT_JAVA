package ait.book;
import ait.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book b1 = new Book(234567, "Journey to the center of the earth","Jules Gabriel Verne", 1864);
        Book b2 = new Book(33367, "Kolobok");

        b1.display();
        b2.display();
    }
}
