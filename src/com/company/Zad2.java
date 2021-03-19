package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy");
        String zipCode = scanner.nextLine();

        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        if (pattern.matcher(zipCode).find()) {                          //Jeśli matcher zwraca true - kod poprawny, jesli nie to niepoprawny
            System.out.println("Kod poprawny");
        } else {
            System.out.println("Kod niepoprawny");
        }
    }
}
