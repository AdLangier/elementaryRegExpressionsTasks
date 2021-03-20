package reviewTasks;

import java.util.Scanner;


//DODATKOWO DODAĆ WARUNEK, KTÓRY SPRAWDZA CZY WYRAZ ZACZYNA SIĘ OD LICZBY


public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();

        if (Character.isUpperCase(word.charAt(0))) {                        //w tym przypadku używamy typu znakowego 'char'
            System.out.println("Wyraz zaczyna się od dużej litery");       // jako klasy "Character", która posiada metody isUpperCase() i isDigit()
        } else if (Character.isDigit(word.charAt(0))) {
            System.out.println("Wyraz zaczyna się od liczby");
        } else {
            System.out.println("Wyraz zaczyna się od małej litery");
        }
    }
}
