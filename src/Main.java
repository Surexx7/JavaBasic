
import test.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test.thisIsStaticMethod();

        Test test = new Test();

        Scanner scanner = new Scanner(System.in);
        //Taking input from user
        System.out.printf("Enter a number");
        int num = scanner.nextByte();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + "is odd");
        }

        scanner.close();
    }
}
