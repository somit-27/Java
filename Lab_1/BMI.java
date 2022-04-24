package Lab_1;
import java.util.Scanner;
/*@author Somit Jain*/
public class BMI {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter weight in kgs and height in metres");
        float w = in.nextFloat();
        float h = in.nextFloat();
        System.out.println("The BMI is "+w/(h*h));
    }
}
