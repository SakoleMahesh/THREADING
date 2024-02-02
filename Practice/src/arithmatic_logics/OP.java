package arithmatic_logics;

import java.util.Optional;

public class OP {

    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalString = Optional.of("Hello, Optional!");

        // Check if a value is present
        if (optionalString.isPresent()) {
            System.out.println("Value is present: " + optionalString.get());
        } else {
            System.out.println("Value is absent.");
        }

        // Creating an Optional with a potentially null value
        String nullableValue = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableValue);

        // Check if a value is present
        if (optionalNullable.isPresent()) {
            System.out.println("Value is present: " + optionalNullable.get());
        } else {
            System.out.println("Value is absent.");
        }

        // Using orElse to provide a default value if the optional value is absent
        String result = optionalNullable.orElse("Default Value");
        System.out.println("Result: " + result);
    }
}
