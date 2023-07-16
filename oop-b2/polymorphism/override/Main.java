package override;

public class Main {
    static void printSalary(NhanVien nv) {
        System.out.println(nv.salary());
    }
    
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        System.out.println("Luong co ban: " +'\n'+ nv.salary());
        

        GiamDoc gd = new GiamDoc();

        System.out.println("Luong giam doc: ");
        printSalary(gd);

        Sale sale = new Sale();

        System.out.println("Luong sale: ");
        printSalary(sale);
    }
}
