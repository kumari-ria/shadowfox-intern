import java.util.InputMismatchException;
import java.util.Scanner;

public class EnhancedCalculator {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n=== Enhanced Console Calculator ===");
                System.out.println("1. Basic Arithmetic");
                System.out.println("2. Scientific Functions");
                System.out.println("3. Unit Conversion");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        basicArithmetic();
                        break;
                    case 2:
                        scientificFunctions();
                        break;
                    case 3:
                        unitConversion();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number!");
                sc.nextLine(); // clear invalid input
            }
        }
    }

    // 1. Basic Arithmetic
    private static void basicArithmetic() {
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("Choose operation: + - * / %");
            char op = sc.next().charAt(0);

            double result;
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    result = a / b;
                    break;
                case '%':
                    result = a % b;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only!");
            sc.nextLine();
        }
    }

    // 2. Scientific Functions
    private static void scientificFunctions() {
        try {
            System.out.println("Choose function: 1.Power 2.Sqrt 3.Log 4.Sin 5.Cos 6.Tan");
            int func = sc.nextInt();
            double result;

            switch (func) {
                case 1:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    result = Math.pow(base, exp);
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    result = Math.sqrt(num);
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    num = sc.nextDouble();
                    result = Math.log(num);
                    break;
                case 4:
                    System.out.print("Enter angle (radians): ");
                    num = sc.nextDouble();
                    result = Math.sin(num);
                    break;
                case 5:
                    System.out.print("Enter angle (radians): ");
                    num = sc.nextDouble();
                    result = Math.cos(num);
                    break;
                case 6:
                    System.out.print("Enter angle (radians): ");
                    num = sc.nextDouble();
                    result = Math.tan(num);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers!");
            sc.nextLine();
        }
    }

    // 3. Unit Conversion
    private static void unitConversion() {
        try {
            System.out.println("Choose conversion: 1.Currency 2.Temperature");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    currencyConversion();
                    break;
                case 2:
                    temperatureConversion();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input!");
            sc.nextLine();
        }
    }

    private static void currencyConversion() {
        try {
            System.out.print("Enter amount in USD: ");
            double usd = sc.nextDouble();
            double inr = usd * 83.0; // fixed rate example
            System.out.println(usd + " USD = " + inr + " INR");
        } catch (InputMismatchException e) {
            System.out.println("Error: Enter a numeric value!");
            sc.nextLine();
        }
    }

    private static void temperatureConversion() {
        try {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            int choice = sc.nextInt();
            double temp;

            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    temp = sc.nextDouble();
                    System.out.println("Fahrenheit: " + ((temp * 9 / 5) + 32));
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    temp = sc.nextDouble();
                    System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
                    break;
                case 3:
                    System.out.print("Enter Celsius: ");
                    temp = sc.nextDouble();
                    System.out.println("Kelvin: " + (temp + 273.15));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Enter a numeric value!");
            sc.nextLine();
        }
    }
}
