import java.util.Scanner;

public class MenuDrivenProgram {
    private static final int MAX_LENGTH = 1024;
    private static String[] names = new String[MAX_LENGTH];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show all names");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    enterName(sc);
                    break;
                case 2:
                    searchName(sc);
                    break;
                case 3:
                    removeName(sc);
                    break;
                case 4:
                    showAllNames(args);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void enterName(Scanner sc) {
        if (count == MAX_LENGTH) {
            System.out.println("The list is full. Cannot add more names.");
            return;
        }

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        if (!isValidName(name)) {
            System.out.println("Invalid name. Try again.");
            return;
        }

        if (isDuplicate(name)) {
            System.out.println("Name already exists. Try again.");
            return;
        }

        names[count++] = name;
        System.out.println("Name added successfully.");
    }

    private static boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    private static boolean isDuplicate(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static void searchName(Scanner sc) {
        System.out.print("Enter a name to search: ");
        String name = sc.nextLine();

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Name not found.");
        } else {
            System.out.println("Name found at index: " + index);
        }
    }

    private static void removeName(Scanner sc) {
        System.out.print("Enter a name to remove: ");
        String nameToRemove = sc.nextLine();
        // checking if the name exists in the array
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameToRemove)) {
                index = i;
                break;
            }
        }

        // removing the name if it exists
        if (index != -1) {
            for (int i = index; i < names.length - 1; i++) {
                names[i] = names[i + 1];
            }
            // resizing the array
            names = java.util.Arrays.copyOf(names, names.length - 1);
            System.out.println("Name removed successfully");
        } else {
            System.out.println("Name not found");
        }
    }

    private static void showAllNames(String[] args) {
        System.out.println("Names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
    }
}
