package oop.object;

public class Main {
    // Car -> object 
    // thuộc tính (attribute) : color, height, ...
    // phương thức (method) : lái xe, phanh xe
    // public static void main(String[] args) {
    //     Main obj = new Main();
    //     System.out.println(obj.x);    
        
    //     Main obj2 = new Main();
    //     System.out.println(obj2.x);    

    // } 

    int x = 5;


    static void staticMethod() {
        System.out.println("static method");
    }

    public void publicMethod(int a) {
        System.out.println("public method " + a);
    }

    public static void main(String[] args) {
        staticMethod();

        Main obj = new Main();

        obj.publicMethod(200);
    }

}


