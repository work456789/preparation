package misc;

import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter something: ");

            String input = scanner.nextLine();

            if ("q".equals(input)) {
                System.out.println("Quit");
                break;
            }

            System.out.println("input : " + input);
            System.out.println("----------\n");
        }

        scanner.close();
    }
}
