
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Generate numbers file");
            System.out.println("2. Separate odd and even numbers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    generateNumbersFile();
                    break;
                case 2:
                    separateOddEvenNumbers();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void generateNumbersFile() {
        try (FileWriter writer = new FileWriter("numbers.txt")) {
            for (int i = 1; i <= 100; i++) {
                writer.write(i + "\n");
            }
            System.out.println("numbers.txt generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void separateOddEvenNumbers() {
        try (Scanner scanner = new Scanner(new java.io.File("numbers.txt"));
             FileWriter oddWriter = new FileWriter("odd.txt");
             FileWriter evenWriter = new FileWriter("even.txt")) {

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    evenWriter.write(number + "\n");
                } else {
                    oddWriter.write(number + "\n");
                }
            }
            System.out.println("Odd and even numbers have been separated into odd.txt and even.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}