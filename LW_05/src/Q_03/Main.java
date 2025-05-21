package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number(0 to exit): ");
            int N = scan.nextInt();
            if(N == 0) {
                System.out.println("Exiting...");
                break;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " * " + i + " = " + (N * i));
            }
        }


    }
}
