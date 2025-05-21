package Q_06;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int) Math.round(Math.random()*100)+1;

        int count = 0;
        while(true){
            System.out.print("Guess the Number : ");
            int Guess = scan.nextInt();
            ++count;
            if(Guess > random){
                System.out.println("Too High... try Again");
            }else if(Guess < random){
                System.out.println("Too Low... try Again");
            } else {
                System.out.print("Your Guess is Correct you guess " + count + " times...!");
                break;
            }

        }
    }
}
