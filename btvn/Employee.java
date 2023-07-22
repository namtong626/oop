package btvn;

class Employee extends User {
    final int TYPE_EMPLOYEE = 1;

    // construct
    public Employee(String name) {
        // tham chiếu đến biến name của abstract User
        super(name);
    }

    public int getType() {
        return TYPE_EMPLOYEE;
    }
}
