package oop.timkieuso;

public class XacDinhSo {
    static String[] arr = {"số dương", "số âm", "số chẵn", "số lẻ"};

    protected static String xacDinh(float x) {
        if (x > 0) {
            if (x % 2 == 0) {
                return arr[0] + " & " + arr[2];
            }

            return arr[0] + " & " + arr[3];
        }
    
        if (x % 2 == 0) {
            return arr[1] + " & " + arr[2];
        }

        return arr[1] + " & " + arr[3];
    }
}
