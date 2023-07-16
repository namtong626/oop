package overloading;

public class Main extends Product {
    public static void main(String[] args) {
        Product pr = new Product();

        System.out.println("Product 1: " +  pr.sum(1, 2));
        System.out.println("Product 2: " +  pr.sum(2, 2)); 
        System.out.println("Product 3: " +  pr.sum(2, 2 ,2));
    }
}
