package oop.object.construct;

public class Construct {
    int year;
    String myName;

    public Construct(int currentYear, String name) {
        myName = name;
        year = currentYear;
    }

    public static void main(String[] args) {
        Construct MyInfo = new Construct(2023, "Hai Nam");
        System.out.println(MyInfo.myName); 
        System.out.println(MyInfo.year);
        Construct MyInfo1 = new Construct(2024, "Hai Nam 1");
        System.out.println(MyInfo1.myName); 
        System.out.println(MyInfo1.year);

    }
}
