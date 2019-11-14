package variables;

public class TypeString {
    public static void main(String[] args) {
        String  text = "Dowolny napis";
        System.out.println("text = " + text);
        System.out.println("Pierwszy znak napisu = " + text.charAt(0));
        System.out.println("Trzeci znak napisu = " + text.charAt(2));
        System.out.println("Ostatni znak napisu = " + text.charAt(text.length() - 1));

        System.out.println("y znajduje się na indeksie: " + text.indexOf('y'));
        System.out.println("napis znajduje się na indeksie: " + text.indexOf("napis"));

        System.out.println("Długość napisu w ziennej text: " + text.length());

//        Jak wydobyć i zapisac w nowej zmiennej slowo napis z zmiennej text
        String napis = text.substring(8,13);
        System.out.println(napis);

        String cite = "Byc albo nie byc";
        String updateCite = cite.replaceAll("c","ć");
        System.out.println(updateCite);

        String name1 = "Ala";
        String name2 = "ala";

        System.out.println(name1.equals(name2));
        System.out.println(name1.length() >= name2.length());


    }
}
