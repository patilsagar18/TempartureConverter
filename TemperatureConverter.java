import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter a temperature value
            System.out.print("Enter the temperature value: ");
            double tempValue = scanner.nextDouble();
            
            // Prompt the user to enter the unit of measurement
            System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
            String unit = scanner.next().trim().toUpperCase();
            
            // Perform the conversion based on the input unit
            if (unit.equals("C")) {
                double convertedTemp = celsiusToFahrenheit(tempValue);
                System.out.printf("%.2f°C is equal to %.2f°F\n", tempValue, convertedTemp);
            } else if (unit.equals("F")) {
                double convertedTemp = fahrenheitToCelsius(tempValue);
                System.out.printf("%.2f°F is equal to %.2f°C\n", tempValue, convertedTemp);
            } else {
                System.out.println("Invalid unit of measurement. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            }
        } catch (Exception e) {
            System.out.println("Invalid temperature value. Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
