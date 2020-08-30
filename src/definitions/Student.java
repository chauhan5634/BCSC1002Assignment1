/*  Created by IntelliJ IDEA.
 *  User: Priyanshu Rajput
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Scanner;

public class Student {
    private String firstName, middleName, lastName;
    long universityRollNumber;
    int numberOfBooksIssued;
    Scanner scanner = new Scanner(System.in);
    public void print() {
        System.out.println("Enter your first name");
        firstName = scanner.next();
        System.out.println("Enter your middle name");
        middleName = scanner.next();
        System.out.println("Enter your university roll number");
        universityRollNumber = scanner.nextLong();
    }
}
