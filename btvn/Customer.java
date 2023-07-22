package btvn;

class Customer extends User {
    final int TYPE_CUSTOMER = 0;

    // construct
    public Customer(String name) {
        // tham chiếu đến biến name của abstract User
        super(name);
    }

    public int getType() {
        return TYPE_CUSTOMER;
    }
}
