package reviewTasks;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        System.out.println("Litery wyrazu co dwa:");
        for (int i = 0; i < word.length() ; i+=2) {        //Ważne tylko znak mniejszości przy określaniu zasięgu pętli
            System.out.print(word.charAt(i)+" ");
        }
    }
}
