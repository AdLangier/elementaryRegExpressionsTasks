package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String sentence = "Wyobraź sobie, że ten tekst zawiera numer " +
                "PIN 9434 twojej karty do bankomatu, a ty wlasnie go zapomniales. Jak szybko go odnaleźć?";

        Pattern pattern = Pattern.compile("[0-9]{4}");             //W klasie "Pattern" ustalamy szablon, którego szukamy
        Matcher matcher = pattern.matcher(sentence);               // W klasie "Matcher" wprowadzamy dane, które przeszukujemy np. jakiś napis


        System.out.println(matcher.find());                        // klasa matcher posiada metodę find()
        String result = String.format(matcher.toString());         //klasa matcher zwraca wartość "true" lub "false" - tutaj zamieniamy ją na Strin aby móc sformatować dane do wyświetlenia
//        int result1Index = result.indexOf("=");
//        int result2Index = result.indexOf("=", result1Index + 1);
//        int result3Index = result.indexOf("=", result2Index + 1);            //Zostawiam ku pamięci, że się męczyłem :)
//        result.replace("=","");
        System.out.println("Twój kod PIN znajdujący się w tekscie to: "
                + result.substring(result.length() - 5, result.length() - 1));


    }
}
