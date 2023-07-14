package oop.noAccessModifier;

public class Student extends Main {

    public String address = "TP HCM";
    @Override
    public void study() {
        System.out.println("Teaching java class");
    }
    
    public void drive() {
        System.out.println("I'm driving");
    }
    
}
