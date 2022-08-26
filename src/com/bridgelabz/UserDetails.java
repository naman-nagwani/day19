package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName="abc";
        String lastName="abc";
        while (!validateName(firstName)) {
            System.out.println("Enter First Name");
            firstName = scan.nextLine();
            if (!validateName(firstName))
                System.out.println("Invalid Input");
        }
        while (!validateName(lastName)) {
            System.out.println("Enter Last Name");
            lastName = scan.nextLine();
            if (!validateName(lastName))
                System.out.println("Invalid Input");
        }
    }

    private static boolean validateName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
