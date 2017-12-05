import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    readAllContacts();





    }

    public static void readAllContacts() {
//        List tempListofCOntacts:

        String directory = "src";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        List<String> contacts;

        try {
            contacts = Files.readAllLines(dataFile);
            for (String contact : contacts) {
                System.out.println(contact);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to the Contact Manager Application");
        System.out.println("1 - View contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Search contact by name");
        System.out.println("4 - Delete existing contact");
        System.out.println("5 - Exit");
        System.out.println("Enter Option: [1, 2, 3, 4, 5]");
//        get their input, verify it as valid number, then return it
    }
}
