package javaBeans;

//Model javaBeans
//1. prywatne pola klasowe
//2. gettery i settery
//3. konstruktory
//4. toString() -> napisowa reprezentacja obiektu
public class RGB {
    private int r;
    private int g;
    private int b;

    public RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Alt + insrt , zaznaczamy gettery i settery i Ctrl A
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
