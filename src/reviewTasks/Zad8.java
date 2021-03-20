package reviewTasks;

import java.util.Scanner;

//DODATKOWO ZAOKRĄGLIĆ WYNIK DO 2 MIEJSC PO PRZECINKU

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień koła w cm2");
        int r = scanner.nextInt();

        double circleField = r * r * Math.PI;

        System.out.println("pole koła wynosi: " + String.format("%.2f", circleField) + " cm2");  // zaokrąglanie - inaczej formatowanie Stringa
    }
}
