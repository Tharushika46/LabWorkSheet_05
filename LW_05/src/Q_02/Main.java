package Q_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num = 0;
        while(true){
            System.out.print("Please enter number : ");
            Num = scanner.nextInt();
            if(Num < 0){
                System.out.println("Exiting....");
                break;
            }
            int count = CountDigit.CountDigit(Num);
            System.out.println("The number of digits in " + Num + " is: " + count);
        }
    }
}
