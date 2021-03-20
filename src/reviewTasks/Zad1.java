package reviewTasks;

import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Zwycięzkie liczby to: ");

        for (int i = 1; i <= 6; i++) {
            int winNumber = random.nextInt(100);
            System.out.print(winNumber+" ");
        }
    }
}
