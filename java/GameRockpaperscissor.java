package com;

import java.util.Scanner;
import java.util.Random;
public class GameRockpaperscissor {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    String[] choices={"rock","paper","scissors"};
    System.out.println("Welcome to Rock-Paper-Scissors!");
    String playAgain;
    do{
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
            String player = sc.nextLine().trim().toLowerCase();
            // Computer random choice
            String computer = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computer);
            if (player.equals(computer)) {
                System.out.println("It's a tie!");
            } else if (
                    (player.equals("rock") && computer.equals("scissors")) ||
                    (player.equals("paper") && computer.equals("rock")) ||
                    (player.equals("scissors") && computer.equals("paper"))
            ) {
                System.out.println("You win!");
            } else if (
                    (computer.equals("rock") && player.equals("scissors")) ||
                    (computer.equals("paper") && player.equals("rock")) ||
                    (computer.equals("scissors") && player.equals("paper"))
            ) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
            }
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.nextLine().trim().toLowerCase();

        }
        while (playAgain.equals("y")|| playAgain.equals("Y"));
        System.out.println("Thank you for playing!");
        sc.close();

    }
    
}
