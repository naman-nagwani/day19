package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName="abc";
        String lastName="abc";
        String eMail="abc";
        String phoneNumber="abc";
        String password="abc";
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
        while (!validateEMail(eMail)) {
            System.out.println("Enter E-Mail");
            eMail = scan.nextLine();
            if (!validateEMail(eMail))
                System.out.println("Invalid Input");
        }
        while (!validatePhoneNumber(phoneNumber)) {
            System.out.println("Enter Phone Number");
            phoneNumber = scan.nextLine();
            if (!validatePhoneNumber(phoneNumber))
                System.out.println("Invalid Input");
        }
        while (!validatePassword(password)) {
            System.out.println("Enter Password");
            password = scan.nextLine();
            if (!validatePassword(password))
                System.out.println("Invalid Input");
        }
    }

    private static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^.{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private static boolean validateEMail(String eMail) {
        Pattern pattern = Pattern.compile("^[a-z 0-9]*@[a-z]*[.][a-z]*$");
        Matcher matcher = pattern.matcher(eMail);
        return matcher.matches();
    }

    private static boolean validateName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
