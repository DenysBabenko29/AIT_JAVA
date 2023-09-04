package ait.book.model;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private String yearOfPublishing;

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;

        this.title = title;
        this.author = author;
        this.yearOfPublishing = "" + yearOfPublishing;
    }

    public Book(long isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        author = "unknown";
        yearOfPublishing = "unknown";
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ISBN - " + isbn + " , title - " + title + " , author - " +
                author + " , yearOfPublishing - " + yearOfPublishing);
    }

}
