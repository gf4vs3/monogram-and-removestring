import java.util.Scanner;

public class Monogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle initial: ");
        String middleInitial = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String monogram = firstName.charAt(0) + "" + middleInitial.toLowerCase() + "" + lastName.charAt(0);

        System.out.println("Your monogram is: " + monogram);

        scanner.close();
    }
}
