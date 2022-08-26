package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName="abc";
        while (!validateFirstName(firstName)) {
            System.out.println("Enter First Name");
            firstName = scan.nextLine();
            if (!validateFirstName(firstName))
                System.out.println("Invalid Input");
        }
    }

    private static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
