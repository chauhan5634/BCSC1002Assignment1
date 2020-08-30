/*  Created by IntelliJ IDEA.
 *  User: Priyanshu Rajput
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Book {
    private String nameOfBook;
    private String nameOfTheAuthor;
    private String ISBN;
    int priceOfBook;
    String colorOfBook;
    Scanner scanner = new Scanner(System.in);
    public Book() {

    }
    public Book(int priceOfBook, String colorOfBook) {
        this.priceOfBook = priceOfBook;
        this.colorOfBook = colorOfBook;
    }
    public Book(String bookName, String authorName, String isbn) {
        this.nameOfBook = bookName;
        this.nameOfTheAuthor = authorName;
        this.ISBN = isbn;
    }
    public void setnameOfBook(String bookName) {
        nameOfBook = bookName;
    }

    public String getnameOfBook() {
        return nameOfBook;
    }

    public void setnameOfTheAuthor(String authorName) {
        nameOfTheAuthor = authorName;
    }

    public String getnameOfTheAuthor() {
        return nameOfTheAuthor;
    }

    public void setISBN(String isbn) {
        ISBN = isbn;
    }

    public String getISBN() {
        return ISBN;
    }
    @Override
    public boolean equals(Object object) {
        Book that = (Book) object;
        boolean isEqual = this.priceOfBook == that.priceOfBook && this.colorOfBook == that.colorOfBook;
        return isEqual;
    }
    public int hashcode() {
        return priceOfBook + colorOfBook.hashCode();
    }
    public String toString() {
        return priceOfBook + " " + colorOfBook;
    }
}


