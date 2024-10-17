import java.util.*;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose any number from 2-10.");
        System.out.println("Press enter to continue.");
        waitForEnter(scanner);
        System.out.println("Multiply the number by 2");
        System.out.println("Press enter to continue.");
        waitForEnter(scanner);
        System.out.println("Add 5 in the resulting number.");
        System.out.println("Press enter to continue.");
        waitForEnter(scanner);
        System.out.println("Multiply the resulting number by 50.");
        System.out.println("Press enter to continue.");
        waitForEnter(scanner);
        System.out.println("Add 1773 if you have already celebrated your birthday this year, otherwise add 1772 in the resulting number, Celebration of your birthday should be as per English date.");
        System.out.println("Press enter to continue.");
        waitForEnter(scanner);
        System.out.println("Now subtract your English birth year to the resulting number.");
        System.out.println("Press enter to continue.");
        waitForEnter(scanner);
        System.out.println("Please enter the resulting number below.");
        int q = scanner.nextInt();
        int r = q % 100;
        System.out.println("You are " + r + " years old");
        int s = q / 100;
        System.out.println("You selected the number " + s);
        scanner.close();
    }

    private static void waitForEnter(Scanner scanner) {
        scanner.nextLine(); // Wait for the Enter key press
    }
}

