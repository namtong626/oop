package oop.noAccessModifier;

public class Second {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Ten: " + obj.myName);
        System.out.println("Tuoi: " + obj.age);
        System.out.println("Dia chi: " + obj.address);

        obj.study(); 
        obj.drive();

        Teacher teacher = new Teacher();
        teacher.study(); 
        teacher.drive();

    }
}
