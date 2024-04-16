package fileoperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileOperation.filesContentLoader();

        FileOperation fileOperations = new FileOperation();
        ExitOption exitOption = new ExitOption();

        Scanner scanner = new Scanner(System.in);

        System.out.println("----!!! File Operations !!!---");
        System.out.println("\n MENU:\n");
        System.out.println("1. Number.txt");
        System.out.println("2. Odd.txt");
        System.out.println("3. Even.txt");
        System.out.println("4. Exit");

        System.out.println("Enter your choice number(1/2/3/4):");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                fileOperations.displayRespectiveFileContent("Number.txt");
                break;
            case 2:
                fileOperations.displayRespectiveFileContent("Odd.txt");
                break;
            case 3:
                fileOperations.displayRespectiveFileContent("Even.txt");
                break;
            case 4:
                exitOption.run();
                break;
            default:
                System.out.println("Please enter valid option!!!");


        }

    }
}
