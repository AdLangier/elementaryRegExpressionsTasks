package reviewTasks;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło");
        String password = scanner.next();

        System.out.println("Cyfry zawarte w wyrazie to: ");
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {           //Zmienna Character znowu :)
                System.out.print(password.charAt(i) + " ");
            }

        }


    }
}
