package Homework6;

public class Book {
    String bookTitle;
    String bookAuthor;

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return bookTitle + " (" + bookAuthor + ")";
    }
}