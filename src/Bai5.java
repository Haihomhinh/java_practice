import java.util.*;
public class Bai5 {
    public static void Assess(int Listening, int Reading) {
        int total = Listening + Reading;
        if (total > 650 && total <= 990) {
            System.out.println("Excellent!! Let fill in the application form!!");
        } else if (total > 450 && total <= 650) {
            System.out.println("Ok! Let continue to practice more!!");
        } else if (total > 0 && total <= 450) {
            System.out.println("You need to improve your English skills!!");
        } else {
            System.err.println("Invalid input. Please check again!!");
        }
    }
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter your Listening score: ");
        int Listening = nhap.nextInt();
        System.out.println("Enter your Reading score: ");
        int Reading = nhap.nextInt();
        Assess(Listening, Reading);
        
        nhap.close();
    }
}
