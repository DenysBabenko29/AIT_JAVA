package ait.book;
import ait.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book b1 = new Book(234567, "Journey to the center of the earth","Jules Gabriel Verne", 1864);
        Book b2 = new Book(7634509837463L, "Kolobok");
        Book b3 = new Book(6473892736453L, "1984", "Eric Artur Blair", 1944);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
