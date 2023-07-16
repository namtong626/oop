package tinhdientich;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu dai:");
        float dai = sc.nextFloat();

        System.out.println("Nhap chieu rong:");
        float rong = sc.nextFloat();

        HinhChuNhat hcn = new HinhChuNhat();

        hcn.chieuDai  = dai;
        hcn.chieuRong  = rong;
        float dientich = hcn.dientichHcn();

        System.out.println("Dien tich = " + dientich);
    }
}
