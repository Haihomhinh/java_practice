import java.util.Scanner;
import java.util.Random;

public class Bai6 {

    public static boolean Check(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = r.nextInt(20);
            if (!Check(arr, temp)) {
                arr[i] = temp;
            } else {
                i--;
            }
        }

        boolean Found = Check(arr, 7);
        if (Found) {
            System.out.println("The shirt of Ronaldo is in the room.");
        } else {
            System.out.println("We honestly sorry about the mistake. The shirt of Ronaldo is not in the room.");
        }
    }
}
