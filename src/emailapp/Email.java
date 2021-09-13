package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail;
    private int mailboxCapacity;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call method that returns a random number
        
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Enter the department\n1 for Sales\n2 for development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "dev";
        } else if (departmentChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
