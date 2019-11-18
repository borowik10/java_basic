package tables;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Deklaracja
        String names [] = new String[5];
//         przypisanie wartosci
        for (int i = 0; i < names.length ; i++) {
            System.out.println("Wprowadz imie: ");
            names[i] = scanner.nextLine();
        }
       }

    }

