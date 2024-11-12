import java.util.ArrayList;
import java.util.Scanner;

// Abstract class using abstraction
abstract class NameHandler {
    // Encapsulated list to store names
    private ArrayList<String> names = new ArrayList<>();

    // Method to add a name (abstract)
    public abstract void addName(String name);

    // Method to get all names
    public ArrayList<String> getNames() {
        return names;
    }

    // Protected method to add a name to the list (used by derived classes)
    protected void storeName(String name) {
        names.add(name);
    }
}

// NameCatcher class extends NameHandler
class NameCatcher extends NameHandler {
    @Override
    public void addName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            storeName(name);
            System.out.println("Name '" + name + "' has been added.");
        } else {
            System.out.println("Invalid name. Please enter a non-empty name.");
        }
    }
}

// Main class
public class acp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameCatcher nameCatcher = new NameCatcher();

        System.out.println("Welcome to the Name Catcher Program!");
        System.out.println("Enter names to add them to the list. Type 'exit' to stop.");

        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            nameCatcher.addName(name);
        }

        System.out.println("\nAll names caught:");
        for (String name : nameCatcher.getNames()) {
            System.out.println(name);
        }

        scanner.close();
    }
}
