package Lab_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
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
