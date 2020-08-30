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
    }
    }