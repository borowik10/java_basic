package javaBeans;

public class Main {
    public static void main(String[] args) {
        RGB colour = new RGB(0, 0, 1);
//        colour.r = 100; -> brak dostępu
        colour.setR(100);
        colour.setG(100);
        colour.setB(100);
        System.out.println(colour.getR());
        System.out.println(colour.getG());
        System.out.println(colour.getB());
        System.out.println(colour);
    }
}
