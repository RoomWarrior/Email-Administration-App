package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, email, alternateEmail;
    private String companySuf = "company.com";
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        // Call method asking for the department - return the department
        this.department = setDepartment();

        // Call method that returns a random number
        this.password = randomPassword(defaultPasswordLength);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuf;

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
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // getters
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nEmail password: " + password +
                "\nMailbox capacity: " + mailboxCapacity + "mb";
    }
}
