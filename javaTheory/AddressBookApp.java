import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookApp {
    private static final Map<String, Contact> addressBook = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Retrieve Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    retrieveContact();
                    break;
                case 4:
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting Address Book. Goodbye!");
                   
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice = 5);
    }

    private static void addContact() {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact();
        addressBook.put();
        System.out.println("Contact added successfully!");
    }

    private static void updateContact() {
        System.out.print("Enter phone number to update: ");
        String phoneNumber = scanner.nextLine();

        if (addressBook.containsKey(phoneNumber)) {
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();

            System.out.print("Enter new address: ");
            String address = scanner.nextLine();

            System.out.print("Enter new email: ");
            String email = scanner.nextLine();

            Contact updatedContact = new Contact(name, address, email);
            addressBook.put(phoneNumber, updatedContact);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    private static void retrieveContact() {
        System.out.print("Enter phone number to retrieve: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = addressBook.get(phoneNumber);
        if (contact != null) {
            System.out.println("Contact details: " + contact);
        } else {
            System.out.println("Contact not found!");
        }
    }

    private static void displayContacts() {
        if (addressBook.isEmpty()) {
            System.out.println("No contacts in the address book.");
        } else {
            System.out.println("All Contacts in the Address Book:");
            for (Map.Entry<String, Contact> entry : addressBook.entrySet()) {
                System.out.println("Phone Number: " + entry.getKey() + ", Contact Details: " + entry.getValue());
            }
        }
    }
}

class Contact {
    String name;
    String address;
    String email;

    public Contact(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email 
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
