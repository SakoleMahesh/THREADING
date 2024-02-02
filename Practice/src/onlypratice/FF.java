package onlypratice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class FF {

    public static void main(String[] args) {
        Map<String, HashSet<Double>> contactDetails = new HashMap<>();

        HashSet<Double> guruPhoneNumbers = new HashSet<>();
        guruPhoneNumbers.add(8308075731d);
        
        HashSet<Double> MAHESHPHONE = new HashSet<>();
        MAHESHPHONE.add(9823747570d);

        HashSet<Double> gauravPhoneNumbers = new HashSet<>();
        gauravPhoneNumbers.add(9595172104d);

        HashSet<Double> atulPhoneNumbers = new HashSet<>();
        atulPhoneNumbers.add(9594272053d);

        contactDetails.put("This is Guru's Phone number.", guruPhoneNumbers);
        contactDetails.put("This is Gaurav's Phone number", gauravPhoneNumbers);
        contactDetails.put("This is Atul's Phone number", atulPhoneNumbers);
        contactDetails.put("This is MAHESH's Phone number", MAHESHPHONE);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Mobile Number : ");

        // Handle non-double input
        try {
            Double mobileNum = scan.nextDouble();
            searchContactNameByMobile(mobileNum, contactDetails);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid mobile number.");
        } finally {
            scan.close(); // Close the Scanner
        }
    }

    public static void searchContactNameByMobile(Double mobileNum, Map<String, HashSet<Double>> contactDetails) {
        boolean contactFound = false;

        for (Map.Entry<String, HashSet<Double>> entry : contactDetails.entrySet()) {
            String key = entry.getKey();
            HashSet<Double> value = entry.getValue();

            if (value.contains(mobileNum)) {
                System.out.println(key);
                contactFound = true;
            }
        }

        if (!contactFound) {
            System.out.println("Contact not found");
        }
    }
}
