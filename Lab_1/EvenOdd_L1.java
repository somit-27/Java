package Lab_1;
import java.util.Scanner;
/*@author Somit Jain*/
public class EvenOdd_L1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter number:");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        int c = num%2;
        switch(c){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }  
    }
}
