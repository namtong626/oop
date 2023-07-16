package overloading;

public class Product {
    public int sum(int x, int y){
        return x + y;
    }
    
    public int sum(int x, int y, int z){
        return x + y + z;
    }
}
