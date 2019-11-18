package java_introdaction;
// CTRL + ?             -> komentarz automatyczny jednowierszowy
// CTRL + Shift + /     -> komentarz blokowy
// psvm                 -> generuje     public static void main(String[] args) {}
// sout                 -> System.out.println();
// CTRL + SHIFT + F10   -> run program
// CTRL = D             -> duplikowanie lini
public class introduction {
    // metoda uruchomieniowa -> automatycznie wywolana jako pierwsza w trakcie uruchomienia projektu
    public static void main(String[] args) {
//         Polecenie wypisujace wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello World!");
//        pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

//         typy danych
        //        byte mySmallNumber = 55555555555; błąd zbyt mała precyzja
        int myFirstNumber = 50;
        System.out.println("myFirstNumber = " + myFirstNumber);
        System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));
                double sallaryNet = 9150.99;
        int vatTax = 23;
        System.out.println("Kwota netto:" + sallaryNet + "zł");
        System.out.println("Kwota brutto:" + (sallaryNet * (1 + (vatTax/100.0))) + "zł");
// formatowanie wyjscia
//        \n -> new line  w printf
        System.out.printf("Kwota brutto: %.2f zł\n", sallaryNet * (1 + (vatTax/100.0)));
        System.out.printf("%.2f zł netto to %.2fzł brutto\n", sallaryNet, sallaryNet * (1 + (vatTax/100.0)));

        System.out.printf("Liczba: %18.2f\n", sallaryNet);

        char smallLetter = 'a';
        char bigLetter = 'A';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println((char) (bigLetter + 10));
        System.out.println(dotChar);
        System.out.printf("Znak: %c ma %d numer w ASCII\n", dotChar, (int)dotChar);

        boolean isActivated = true;
        System.out.println("aktywna " + (isActivated));
        System.out.println(!isActivated);

    }
}
