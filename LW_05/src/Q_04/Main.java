package Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid:");
        int rows = scan.nextInt();
        for(int i = 1; i <= rows; i++){
            System.out.print(" ".repeat(rows-i));
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//           *
//          * *
//         * * *
//        * * * *
//       * * * * *
//      * * * * * *