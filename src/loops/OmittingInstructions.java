package loops;

public class OmittingInstructions {
    public static void main(String[] args) {
//        program wyszukujacy okreslony znak w napisie
//        jesli znaleziono - wpisz pozycje tego znaku
//        jesli nie znaleziono wypisz stosowny komunikat
        String sentence = "Ala ma kota a kot ma Ale";
        char search = 'ę';
        boolean isFound = false;
        for (int i = 0; i < sentence.length() ; i++) {
            System.out.println("Iteracja nr " + i);
            if (sentence.charAt(i) == search){
                System.out.printf("Znaleziono znak %c na indeksie %d\n", sentence.charAt(i), i);
                isFound = true;
                break;
            }
        }
        if (isFound == false){
            System.out.printf("Nie znaleziono znaku %c w tekscie %s\n", search, sentence);
        }
        System.out.println("==============================");
        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;
            System.out.println(i);
        }
        }

    }

