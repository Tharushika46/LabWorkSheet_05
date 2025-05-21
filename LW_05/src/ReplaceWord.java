import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String input = scan.nextLine();
        System.out.print("Word to be replaced : ");
        String replaceTo = scan.nextLine();
        System.out.print("Replacement word : ");
        String replace = scan.nextLine();
        String newWord = input.replace(replaceTo, replace);
        System.out.println("===Success===");
        System.out.println(newWord);
    }
}
