package variables;

public class variable {
    public static void main(String[] args) {
//        daklaracja -> rezerwacja miejsca w pamieci podrecznej
//         typ nazwaZmiennej;
        int age;
//        inicjalizacja -> pierwsze przypisanie wrtosci
        age = 14;
        System.out.println("Wiek: " + age);
//        deklaracja i inicjalizacja
        double result = 0.01;
        System.out.println("Wynik: " + result);
//      modyfikacja wartosci zmiennej
        age = age + 15;
        age = age + 15;
        System.out.println("Wiek: " + age);

        final byte HOURS_IN_DAY = 24;
        final boolean DECISION;
//        HOURS_IN_DAY = 23 -> bład
        DECISION = true;
//        DECISION = false -> bład

    }
}
