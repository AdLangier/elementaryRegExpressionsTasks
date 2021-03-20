package reviewTasks;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres");
        String url = scanner.next();

        if (url.startsWith("http://")
                || url.startsWith("https://")
                || url.startsWith("www.")) {
            System.out.println("To jest poprawny adres URL");
        } else {
            System.out.println("Adres jest nie poprawny");
        }

    }
}
