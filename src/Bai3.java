package src;
import java.util.Scanner;
import java.util.Random;

public class Bai3 {
    public static void main(String [] args){
        Scanner nhap = new Scanner (System.in);
        Random quaySo = new Random();
        System.out.println("Enter the numbers of your lottery ticket: ");
        int [] ticket = new int[6];
        for(int i = 0; i < ticket.length; i++){
            ticket[i] = nhap.nextInt();
        }

        int [] lotteryNumbers = new int[6];
        for(int i=0;i<6;i++){
            lotteryNumbers[i] = quaySo.nextInt(100);
        }

        System.out.println("The lottery numbers are: ");
        for(int i=0;i<lotteryNumbers.length;i++){
            System.out.print(lotteryNumbers[i] + " ");
        }
        System.out.println();

        int count =0;
        for(int i=0;i<ticket.length;i++){
            if(lotteryNumbers[i] == ticket[i]){
                count++;
            }
        }
        System.out.println("You have " + count + " correct numbers.");
        if(count == 6){
            System.out.println("Congratulations! You won the lottery!");
        }
        else {
            System.out.println("Sorry, you did not win the lottery. Better luck next time!");
        }
       
        nhap.close();
    }
}
