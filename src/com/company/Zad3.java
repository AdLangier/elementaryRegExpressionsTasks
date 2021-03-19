package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();

        Pattern pattern = Pattern.compile("ab+");
        if (pattern.matcher(word).find()) {
            System.out.println("sekwencja \"ab\" występuje w podanym wyrazie");
        } else {
            System.out.println("sekwencja \"ab\" nie występuje w podanym wyrazie");
        }
    }
}
