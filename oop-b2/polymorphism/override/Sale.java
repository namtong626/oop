package override;

public class Sale extends NhanVien{
    @Override
    int salary() {
        return baseSalary * 2;
    }
}
