import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        // Input validation loop for Celsius temperature
        do {
            System.out.print("Enter temperature in Celsius: ");
            // Check if the input is a valid double
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
            celsius = scanner.nextDouble();
            if (celsius < -273.15) {
                System.out.println("Temperature cannot be below absolute zero (-273.15°C). Please enter a valid temperature.");
            }
        } while (celsius < -273.15); // Temperature cannot be below absolute zero

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Equivalent temperature in Fahrenheit: %.2f°F%n", fahrenheit);
    }
}
