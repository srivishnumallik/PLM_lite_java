import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        User user = new User("Sri", "Manager");

        while (true) {
            System.out.println("\n1. Add Product\n2. View Products\n3. Advance Stage\n4. Exit");
            System.out.print("Enter your choice: ");
            String input = sc.nextLine().trim();

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine().trim();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine().trim();
                    products.add(new Product(id, name));
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        for (Product p : products) {
                            System.out.println(p.getId() + " | " + p.getName() + " | " + p.getStage());
                        }
                    }
                    break;

                case 3:
                    if (!user.canAdvance()) {
                        System.out.println("Access denied. Only Managers/Admins can advance stages.");
                        break;
                    }
                    System.out.print("Enter Product ID to advance: ");
                    String pid = sc.nextLine().trim();
                    boolean found = false;
                    for (Product p : products) {
                        if (p.getId().equalsIgnoreCase(pid)) {
                            LifecycleManager.advanceStage(p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
    }
}
