package onlypratice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindKeyByValue {
    public static void main(String[] args) {
        // Assuming a simple map to store names and mobile numbers
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John Doe", "1234567890");
        phoneBook.put("Jane Smith", "9876543210");
        phoneBook.put("Bob Johnson", "5555555555");
        phoneBook.put("Bob Johnson", "1234567890");

        Scanner sc= new Scanner(System.in);
        System.out.println(sc.getClass());
        // Specify the value to search for
        System.out.print("Enter Number = ");
        String targetValue = sc.next();

        // Find the key associated with the target value
        String foundKey = findKeyByValue(phoneBook, targetValue);

        // Displaying the result
        if (foundKey != null) {
            System.out.println("Key found: " + foundKey);
        } else {
            System.out.println("No such key for the given value.");
        }
    }

    // Method to find the key associated with a value
    private static String findKeyByValue(Map<String, String> map, String targetValue) {
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            if (targetValue.equals(entry.getValue())) {
                return entry.getKey();
            }
        }

        // If no matching key is found
        return null;
    }
}
