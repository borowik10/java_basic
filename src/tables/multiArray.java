package tables;

public class multiArray {
    public static void main(String[] args) {
        char[][] t = {
                {'_', 'X', '_'},
                {'_', 'O', '_'},
                {'_', 'X', '_'}
        };
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println();
        }
    }
}
