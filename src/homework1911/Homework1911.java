package homework1911;

import java.util.Scanner;

public class Homework1911 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Deklaracja
        String names[] = new String[1];
//         przypisanie wartosci
        for (int i = 0; i < names.length; i++) {
            System.out.println("Wprowadz imie: ");
            names[i] = scanner.nextLine();

        }
    }
}
