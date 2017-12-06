import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static int userInput = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Contact Manager Application");

    do {

        userInput = showMenu();


    } while (userInput != 5);

    }

    public static int showMenu() {
        System.out.println("1 - View contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Search contact by name");
        System.out.println("4 - Delete existing contact");
        System.out.println("5 - Exit");
        System.out.println("Enter Option: [1, 2, 3, 4, 5]");

        System.out.println();

        if (sc.hasNextInt()) {
            userInput = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Please enter a number from the options below");
            return showMenu();
        }

        if ( 1 > userInput || userInput > 5 ) {
            System.out.println("Please enter a number from the options below");
            return showMenu();
        } else {
            List<String> currentList = getCurrentContacts();
            userInputSwitchCase(userInput, currentList);
            return userInput;
        }
    }

    public static List<String> getCurrentContacts() {
        String directory = "src";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        List<String> contacts;

        try {
            contacts = Files.readAllLines(dataFile);
            return contacts;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return getCurrentContacts();
    }

    public static void userInputSwitchCase(int userInput, List<String> currentContacts) {
        switch (userInput) {
            case 1:
                readAllContacts();
                break;
            case 2:
                try {
                    addNewContact();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
//                case 3:
//
//                    break;
            case 4:
                deleteContact(currentContacts);
                break;
        }
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

    public static void addNewContact() throws IOException {
        String directory = "src";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        ArrayList<String> contacts = new ArrayList<>();
        System.out.println("Enter the contact's name and number:");
        contacts.add(sc.nextLine());

        Files.write(dataFile, contacts, StandardOpenOption.APPEND);
        System.out.println();
        System.out.println("New Contact: \"" + contacts.get(0) + "\" Added");
        System.out.println("Main Menu");
        System.out.println("---------------");
    }

    public static void deleteContact(List<String> contactsList) {
        // THIS IS MESSY, CAN BE CLEANED UP AND ALTERED LATER
        System.out.println("Which contact would you like to delete?");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + ". " + contactsList.get(i));
        }
        System.out.println("---------------");
        System.out.println("Please select the contact option from above- eg. [1, 2, 5...]");
        int deletionChoice = 0;

        if (sc.hasNextInt()) {
            deletionChoice = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Please enter a valid contact number.");
            deleteContact(contactsList);
        }

        if ( 1 > userInput || userInput > contactsList.size() ) {
            System.out.println("Please enter a valid contact number");
            deleteContact(contactsList);
        } else {
            String contactDeleted = contactsList.get(deletionChoice - 1);
            contactsList.remove(deletionChoice - 1);
            String directory = "src";
            String filename = "contacts.txt";
            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);
            try {
                Files.write(dataFile, contactsList);
                System.out.println();
                System.out.println("Successfully Deleted Contact: \"" + contactDeleted + "\"");
                System.out.println();
                System.out.println("Main Menu");
                System.out.println("---------------");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
