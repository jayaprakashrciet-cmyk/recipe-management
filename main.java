
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] recipes = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== RECIPE MANAGEMENT =====");
            System.out.println("1. Add Recipe");
            System.out.println("2. View Recipes");
            System.out.println("3. Search Recipe");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Recipe Name: ");
                        recipes[count] = sc.nextLine();

                        count++;

                        System.out.println("Recipe Added Successfully!");
                    } else {
                        System.out.println("Recipe Storage Full!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- RECIPE LIST ---");

                    if (count == 0) {
                        System.out.println("No Recipes Available!");
                    }

                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + recipes[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Recipe Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (recipes[i].equalsIgnoreCase(search)) {
                            System.out.println("Recipe Found: " + recipes[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Recipe Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
