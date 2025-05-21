package Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Word or Phase : ");
        String word = scan.nextLine();
        int lenth = word.length();
        for( int i = lenth-1; 0 <= i ; i--){
            System.out.print(word.charAt(i));
        }
    }
}
