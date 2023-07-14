package oop.timkieuso;

import java.util.*;

public class Main extends XacDinhSo{

    final double pi = 3.14;
    
    public static void main(String[] args) {
        System.out.println("nhap so:");

        Scanner sc = new Scanner(System.in);
        float soDcNhap = sc.nextFloat();
        
        // XacDinhSo obj = new XacDinhSo();
        // String content = obj.xacDinh(soDcNhap);

        String content = xacDinh(soDcNhap);
        String kq = hienthiKq(content, soDcNhap);

        System.out.println(kq);
    }

    public static String hienthiKq(String kq, float n) {
        return n + " la " + kq;
    }
}
