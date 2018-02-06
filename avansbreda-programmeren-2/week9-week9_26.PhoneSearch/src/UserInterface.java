import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author andytaber
 */
public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    PhoneBook phoneBook = new PhoneBook();
    
    public void run() {
        instructions();
        runningPhoneSearch();
    }
      
    private void instructions() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println();
    }
    
    private void runningPhoneSearch() {
        String command = getCommand();
        while(!command.equals("x")) {
            processCommand(command);
            command = getCommand();
        }
    }
    
    private String getCommand() {
        System.out.print("command: ");
        String command = scanner.nextLine();
        return command;
    }
    
    private void processCommand(String command) {
        int commandNumber = Integer.parseInt(command);
        switch(commandNumber) {
            case 1: addNumber();
                break;
            case 2: searchNumber();
                break;
            case 3: searchPersonByNumber();
                break;
            case 4: addAddress();
                break;
            case 5: searchPersonalInfo();
                break;
            case 6: deletePersonalInfo();
                break;
            case 7: filteredListing();
                break;
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String person = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();
        System.out.println();
        phoneBook.addPhone(person, number);
    }

    private void searchNumber() {
        System.out.print("whose number: ");
        String person = scanner.nextLine();
        Set<String> phones = phoneBook.searchPhoneByName(person);
        printPhones(phones);
    }

    private void searchPersonByNumber() {
        System.out.print("number: ");
        String number = scanner.nextLine();
        String name = phoneBook.searchByNumber(number);
        printName(name);
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();
        String address = street + " " + city;
        phoneBook.addAddress(name, address);
        System.out.println();
    }

    private void searchPersonalInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        String address = phoneBook.searchAddressByName(name);
        Set<String> phones = phoneBook.searchPhoneByName(name);
        printInfo(address, phones);
    }

    private void deletePersonalInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phoneBook.removeInfo(name);
        System.out.println();
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String kw = scanner.nextLine();
        System.out.println();
        Set<String> names = phoneBook.keywordSearch(kw);
        printSearchResults(names);
    }
    
    private void printPhones(Set<String> phones) {
        if(phones == null) {
            System.out.println("  not found");
        } else {
            for(String phone : phones) {
                System.out.println(" " + phone);
            }
        }
        System.out.println();
    }
    
    private void printName(String name) {
        if(name == null) {
            System.out.println("  not found");
        } else {
            System.out.println(name);
        }
        System.out.println();
    }
    
    private void printInfo(String address, Set<String> phones) {
        if(address == null && phones == null) {
            System.out.println("  not found");
            System.out.println();
            return;
        } 
        
        if(address == null) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + address);
        }
        
        if(phones == null) {
            System.out.println("  phone number not found");
            System.out.println();
        } else {
            System.out.println("  phone numbers:");
            for(String phone : phones) {
                System.out.println("   " + phone);
            }
        }
        System.out.println();
    }
    
    private void printSearchResults(Set<String> names) {
        if(names.isEmpty()) {
            System.out.println(" keyword not found");
        }
        
        for(String name : names) {
            String address = phoneBook.searchAddressByName(name);
            Set<String> phones = phoneBook.searchPhoneByName(name);
            System.out.println(" " + name);
            printInfo(address, phones);
        }
    }
    
}
