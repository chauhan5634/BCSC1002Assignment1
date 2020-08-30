/*  Created by IntelliJ IDEA.
 *  User: Priyanshu Rajput
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        System.out.println("\n-=-=-=-=-Welcome To The Front Desk-=-=-=-=-\nHow may I help you today?\n1. Issue a new Book for me.\n2. Return a previously issues book for me\n3. Show me all issues books.\n4. Exit.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number what would you like to do");
        int number = scanner.nextInt();
        int numberOfBooksIssued = 0;
        if (number == 1) {
            Student student = new Student();
            student.print();
            Book book = new Book();
            book.print();
            System.out.println("Your book Issued Successfully: " + ++numberOfBooksIssued);
            Book book1 = new Book(750, "blue");
            Book book2 = new Book(750, "blue");
            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book1.equals(book2));
        }
        if (number == 2) {
            Student student = new Student();
            student.print();
            System.out.println("Enter Book Name");
            String nameOfBook = scanner.next();
            System.out.println("Enter the author name");
            String nameOfTheAuthor = scanner.next();
            System.out.println("Enter the ISBN number");
            String ISBN = scanner.next();
            Book ob = new Book(nameOfBook, nameOfTheAuthor, ISBN);
            Library library = new Library();
            System.out.println("Your Book Returned Successfully" + --numberOfBooksIssued);
        }

        if (number == 3) {
            Student student = new Student();
            student.print();
            student.setNumberOfBooksIssued(numberOfBooksIssued);
            System.out.println("Number Of Books Issued to you: " + student.getNumberOfBooksIssued());
            Library library = new Library();
            library.setBookInStock(student.toString());
            System.out.println(library.getBookInStock());
            if (numberOfBooksIssued == 0) {
                student.IssuedBooksNames();
            }
        }
        if (number == 4) {
            System.out.println(" Thanks ");
            System.exit(0);
        }
    }
}