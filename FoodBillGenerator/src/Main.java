import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask if the user wants Special Fried Rice or Regular Fried Rice
        System.out.println("Do you want Special Fried Rice? (yes/no): ");
        String specialChoice = scanner.nextLine().trim().toLowerCase();

        // Ask if the user wants a vegetarian version
        System.out.println("Do you want vegetarian fried rice? (yes/no): ");
        String vegChoice = scanner.nextLine().trim().toLowerCase();
        boolean isVegetarian = vegChoice.equals("yes");

        FriedRice order;

        if (specialChoice.equals("yes")) {
            order = new SpecialFriedRice(isVegetarian);
        } else {
            order = new FriedRice(isVegetarian);

            // Ask if the user wants extra egg omelet
            System.out.println("Do you want to add an extra egg omelet? (yes/no): ");
            if (scanner.nextLine().trim().toLowerCase().equals("yes")) {
                order.addEggOmelet();
            }

            // Ask if the user wants an extra portion
            System.out.println("Do you want to add an extra portion? (yes/no): ");
            if (scanner.nextLine().trim().toLowerCase().equals("yes")) {
                order.addExtraPortion();
            }
        }

        // Ask if the user wants take-away
        System.out.println("Do you want take-away? (yes/no): ");
        if (scanner.nextLine().trim().toLowerCase().equals("yes")) {
            order.takeAway();
        }

        // Print the final bill
        order.getBill();

        // Close scanner
        scanner.close();
    }
}
