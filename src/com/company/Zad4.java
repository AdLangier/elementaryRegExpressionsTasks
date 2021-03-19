package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrażenie");
        String word = scanner.next();

        Pattern pattern = Pattern.compile("\\w+");                         //double slash "\w" znaczy mała lub duża litera lub cyfra [a-zA-Z_0-9] (nie wiem dlaczego + ale inaczej nie działa
        if (pattern.matcher(word).matches()) {                 //istotna zmiana metody na matches() - oznacza to że cały input musi się zgadzać z wzorcem
            System.out.println("Poprawny wzorzec");
        } else {
            System.out.println("Nie wolno używać znaków specjalnych!");
        }
    }
}
