package oop.noAccessModifier;

public class Teacher extends Main {

    @Override
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void drive() {
        System.out.println("Teacher is driving");
    }
    
}
