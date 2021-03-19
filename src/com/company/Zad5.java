package com.company;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie");
        String sentence = scanner.nextLine();

        String changed = sentence.replaceAll("\\s+", ",");
        System.out.println(changed);
    }
}
