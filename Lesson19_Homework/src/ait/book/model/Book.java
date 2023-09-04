package ait.book.model;

public class Book {
    private final long isbn;
    private String title;
    private String author;
    private String yearOfPublishing;
    public static final int ISBN_LENGTH = 13;

    public Book(long ibsn, String title, String author, int yearOfPublishing) {
        if (countIBSN(ibsn) == ISBN_LENGTH) {
            this.isbn = ibsn;
        } else {
            this.isbn = -1;
        }

        this.title = title;
        this.author = author;
        this.yearOfPublishing = "" + yearOfPublishing;
    }

    public Book(long ibsn, String title) {
        if (countIBSN(ibsn) == ISBN_LENGTH) {
            this.isbn = ibsn;
        } else {
            this.isbn = -1;
        }
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

    public String toString() {
        return "ISBN: " + isbn + " , title: " + title + " , author: " +
                author + " , yearOfPublishing: " + yearOfPublishing;
    }

    public int countIBSN(long ibsn) {
        return String.valueOf(ibsn).length();
    }

}
