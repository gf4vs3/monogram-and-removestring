import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a string: ");
        String stringToRemove = scanner.nextLine();

        String result = sentence.replace(stringToRemove, "");

        System.out.println(result);

        scanner.close();
    }
}
