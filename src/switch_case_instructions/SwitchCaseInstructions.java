package switch_case_instructions;

import java_introdaction.Grade;

import java.util.Scanner;

public class SwitchCaseInstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
boolean isFinished = false;
while(isFinished != true) {
//        CLI -> Command Line Interface
    System.out.println("Witaj w naszej aplikacji");
    System.out.println("(L) - Logowanie");
    System.out.println("(R) - Rejestracja");
    System.out.println("(Q) - Wyjście");

    char decision = scanner.nextLine().toUpperCase().charAt(0);

    switch (decision) {
//            case 'L':
        case 'l':
            System.out.println("logowanie");
            break;
//            case 'R':
        case 'r':
            System.out.println("rejestracja");
            break;
        case 'Q':
            System.out.println("wyjście");
            isFinished = true;
            break;
        default:
            System.out.println("zły wybór");
            break;

    }
}
    Grade grade = Grade.celujący;
    switch (grade) {
        case celujący:
            System.out.println("Swietnie jestes najlepszy");
            break;
        case bardzo_dobry:
            System.out.println("Jest dobrze");
            break;
        case dobry:
        case dostateczny:
        case dopuszczający:
        case niedostateczny:
            System.out.println("Jest zle");
            break;
    }
}
    }
