package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call method that returns a random number
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password: " + this.password);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("""
                Enter the department
                1 for Sales
                2 for development
                3 for Accounting
                0 for none
                Enter department code:\s""");
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
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUXWZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
