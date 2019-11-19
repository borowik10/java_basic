package oop;

import java.util.Scanner;

public class Main {
//    Klasa główna - uruchomieniowa
public static void main(String[] args) {
//    utworzenie obiektu
    User userOne = new User();
//    Odwołanie do pola klasowego
    userOne.name = "Michał";
    userOne.lastName = "Kowal";
    userOne.activated = true;
    userOne.salaryNet = 10100;
    userOne.gender = 'M';

//    Wywolanie metody
    userOne.printUser();

    User userTwo = new User("Adam", "Kowal", 'M', false, 4000);
    userTwo.printUser();

    User userThree = new User("Anna", "Kowwal", 'K', true, 8000);
    userThree.printUser();
    userOne.salaryNet = 95000;
    System.out.println("===============================");
    userOne.printUser();
    userTwo.printUser();
    userThree.printUser();
    System.out.println("===============================");
    double sallaryGross = userOne.calculateSallaryGross();
    System.out.println("sallaryGross = " + sallaryGross);
    System.out.println("Calculated sallary gross");
    System.out.println("================================");
    System.out.println(userThree.modifyUserParameters(15000, false));

    Scanner scanner = new Scanner(System.in);
    System.out.println("Wprowadź imię: ");
    String name = scanner.nextLine();
    System.out.println("Wprowadź nazwisko: ");
    String lastName = scanner.nextLine();
    System.out.println("Wprowadź płeć: ");
    char gender = scanner.nextLine().charAt(0);
    System.out.println("Wprowadź pensje: ");
    double sallaryNet = scanner.nextDouble();
    User userFour = new User(name, lastName, gender, true, sallaryNet);
userFour.printUser();

}

}
