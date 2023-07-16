package override;

public class GiamDoc extends NhanVien {
    @Override
    int salary() {
        return baseSalary * 4;
    }
}
