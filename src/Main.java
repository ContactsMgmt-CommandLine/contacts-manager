import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int userInput = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Contact Manager Application");

    do {

        userInput = showMenu();

    } while (userInput != 5);

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
//                return contacts;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("---------------");
    }

    public static int showMenu() {
        System.out.println("1 - View contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Search contact by name");
        System.out.println("4 - Delete existing contact");
        System.out.println("5 - Exit");
        System.out.println("Enter Option: [1, 2, 3, 4, 5]");

        Scanner sc = new Scanner(System.in);
        System.out.println();

        if (sc.hasNextInt()) {
            userInput = sc.nextInt();
        } else {
            System.out.println("Please enter a number from the options below");
            return showMenu();
        }

        if ( 1 > userInput || userInput > 5 ) {
            System.out.println("Please enter a number from the options below");
            return showMenu();
        } else {
            userInputSwitchCase(userInput);
            return userInput;
        }
    }

    public static void userInputSwitchCase(int userInput) {
        switch (userInput) {
            case 1:
                readAllContacts();
                break;
//                case 2:
//                    addNewContact();
//                    break;
//                case 3:
//
//                    break;
//                case 4:
//
//                    break;
        }
    }

}
