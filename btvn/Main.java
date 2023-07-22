package btvn;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<User> users;
    static String[] _type = { "customer", "employee" };

    private static List<User> inputInfo(int numUsers) {
        List<User> usersArray = new ArrayList<>();

        for (int i = 0; i < numUsers; i++) {
            System.out.print("Enter name of user " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter user type (customer = 0 or employee = 1): ");
            int type = scanner.nextInt();

            User user = (type == 1) ? new Employee(name) : new Customer(name);

            System.out.print("Enter number of orders for " + name + ": ");

            int numOrders = scanner.nextInt();

            scanner.nextLine();

            for (int j = 0; j < numOrders; j++) {
                System.out.print("Enter product name for order " + (j + 1) + " of " + name + ": ");
                String productName = scanner.nextLine();

                System.out.print("Enter quantity for order " + (j + 1) + " of " + name + ": ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                Order order = new Order(productName, quantity);
                user.addOrder(order);
            }

            usersArray.add(user);
        }

        return usersArray;
    }

    private static void printInfo(List<User> users) {

        System.out.println("+----------------------+----------------------+----------------------+");
        System.out.println("| Name                 | Type                 | Orders               |");
        System.out.println("+----------------------+----------------------+----------------------+");

        for (User user : users) {
            System.out.printf("| %-20s | %-20s |", user.getName(), _type[user.getType()]);

            List<Order> orders = user.getOrders();

            if (orders.isEmpty()) {
                System.out.printf(" %-20s |\n", "N/A");
            } else {
                for (Order order : orders) {
                    System.out.printf(" %-20s | %-20d |\n", order.getProduct(), order.getQuantity());
                }
            }
        }

        System.out.println("+----------------------+----------------------+----------------------+");
    }

    public static void main(String[] args) {
        int numUsers = 0;

        while (numUsers <= 0) {
            System.out.print("Enter number of users (must be greater than 0): ");

            if (scanner.hasNextInt()) {
                numUsers = scanner.nextInt();

                if (numUsers <= 0)
                    System.out.println("Invalid input. Please enter a number greater than 0.");

            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        // check nhập chữ hay số ở trong inputInfo tương tự như trên

        scanner.nextLine();

        users = inputInfo(numUsers);

        printInfo(users);
    }
}
