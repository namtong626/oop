package oop.modifiers;

public class Main {
    // modifier
    // public, protected, private, default
    protected int x1, x2;

    public Main(int x, int y) {
        x1 = x;
        x2 = y;
    }

    
    protected int tinhTong() {
        return x1 + x2;
    }

    private int tru() {
        return x2 - x1;
    }

    public static void main(String[] args) {
        Main obj = new Main(1, 2);
        System.out.println(obj.tru());
    }
}
