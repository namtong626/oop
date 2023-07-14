package oop.object.construct;

public class MainConstruct {
    int x;

    public MainConstruct() {
        x = 5;
    }

    public static void main(String[] args) {
        MainConstruct obj = new MainConstruct();
        System.out.println(obj.x);
    }
}
