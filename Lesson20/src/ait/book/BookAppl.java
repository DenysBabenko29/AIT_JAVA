package ait.book;

import ait.book.dao.Library;
import ait.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Library library1 = new Library(10);
        library1.addBook(new Book(3000000000000l, "Book1", "Author1", 1998));
        library1.addBook(new Book(5000000000000l, "Book3", "Author2", 1990));
        System.out.println(library1.getSize());
        library1.addBook(new Book(6000000000000l, "Book4", 1981));
        library1.addBook(new Book(2000000000000l, "Book0", 1988));
        library1.addBook(new Book(4000000000000l, "Book2", "Author1", 1995));
        System.out.println(library1.getSize());

        library1.printBooks();
        System.out.println("===============================");
        System.out.println(library1.findBook(500000000000L));
        System.out.println("==============================");
        library1.removeBook(3000000000000l);
        library1.printBooks();
        System.out.println("===================");
        library1.removeBook(2000000000000l);
        library1.printBooks();

    }
}
