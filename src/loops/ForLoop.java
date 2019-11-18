package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
//        Ala ma kota   znaki
//        012345678910  indeksy
//        Wypisz w petli wszystkie znaki pojedynczo
        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak: %c\n", i, sentence.charAt(i));
            }
        }
        int numbers [] = {2,4,6,8};
        for (int number : numbers) {
            System.out.printf("wartość %d\n", number);
        }
    }
}
