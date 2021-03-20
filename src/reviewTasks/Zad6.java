package reviewTasks;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        StringBuilder reversedWord = new StringBuilder(word).reverse();    //Ważne - musimy utworzyć obiekt klasy StringBuilder
                                                                           // żeby użyć metody reverse()
        if (word.equalsIgnoreCase(reversedWord.toString())) {              // żeby porównać oba słowa trzeba spowrotem
            System.out.println("Wyraz jest palindromem");                  // zamienić StringBuildera na Stringa
        } else {
            System.out.println("Wyraz nie jest palindromem");
        }
    }
}
