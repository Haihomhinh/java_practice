import java.util.Scanner;

public class Bai4 {
    public static int[] Refund(int[] before, int avg) {
        int n = before.length;
        int[] after = new int[n];
        for (int i = 0; i < n; i++) {
            after[i] = before[i] - avg;
        }
        return after;
    }
    
    public static void printRefund(int[] after) {
        for (int i = 0; i < after.length; i++) {
            if (after[i] > 0) {
                System.out.println("Person " + (i + 1) + " should receive " + after[i] + " VND.");
            } else if (after[i] < 0) {
                System.out.println("Person " + (i + 1) + " should pay " + (-after[i]) + " VND.");
            } else {
                System.out.println("Person " + (i + 1) + " is even.");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter the number of total people: ");
        int number = nhap.nextInt();
        System.out.println("Enter the total amount of money: ");
        int total = nhap.nextInt();
        int avg = (int) total / number;

        System.out.println("Enter each person's contribution: ");
        int[] contributions = new int[number];
        for (int i = 0; i < number; i++) {
            contributions[i] = nhap.nextInt();
        }

        int[] refunds = Refund(contributions, avg);
        printRefund(refunds);
        nhap.close();
        
    }
}
