package onlypratice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        // Assuming a simple map to store mobile numbers and names
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("1234567890", "John Doe");
        phoneBook.put("9876543210", "Jane Smith");
        phoneBook.put("5555555555", "Bob Johnson");

        // Getting mobile number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        // Finding the name associated with the mobile number
        String foundName = findNameByMobileNumber(phoneBook, mobileNumber);

        // Displaying the result
        if (foundName != null) {
            System.out.println("Name found: " + foundName);
        } else {
            System.out.println("No such number for the given mobile number.");
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // Method to find the name associated with a mobile number
    private static String findNameByMobileNumber(Map<String, String> phoneBook, String mobileNumber) {
        return phoneBook.get(mobileNumber);
    }
}
