package src;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("How many matches have MU taken part in this season?");
        int matches = nhap.nextInt();
        System.out.println("Enter the number of each part: Won, Draw, Lost of each match:");

        int won = nhap.nextInt();
        int draw = nhap.nextInt();
        int lost = nhap.nextInt();

        if (won + draw + lost - matches != 0) {
            System.out.println("The total number of matches is not correct. Please check again!");
            nhap.close();
            return;
        }

        int totalPoints = won * 3 + draw * 1 + lost * 0;

        System.out.println("Total points of MU in this season is: " + totalPoints);

        nhap.close();
    }
}
