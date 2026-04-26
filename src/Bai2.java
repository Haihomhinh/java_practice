package src;
import java.util.Scanner;

public class Bai2 {
    public static void main(String [] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");
        int n = nhap.nextInt();
        if(n<0){
            System.out.println("Not a positive integer. Please check again!");
        }
        else if (n>100){
            System.out.println("The number is too large. Please check again!");
        }
        else{
            System.out.println("Buying " + n+ " completely!!");
        }
        
        nhap.close();
    }    
}
