/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class Marks_L2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter marks in Maths, Physics, Chemistry, English and CS");
        int M = in.nextInt();
        int P = in.nextInt();
        int C = in.nextInt();
        int E = in.nextInt();
        int CS = in.nextInt();
        int sum = M+P+C+E+CS;
        float OA = (float) ((float)sum/5.0);
        float EA =(float)(((float)2*M)+(float)P+((float)C/4));
        float CSA = (float)CS;
        if(OA>75 && EA>CSA){
            System.out.println("Probable Mech, Civil, EEE, ECE candidate");
        }
        else if(OA>75 && CSA>EA){
            System.out.println("Probable CSE,IT,IS candidate");
        }
        else if(OA<75 && CSA<EA){
            System.out.println("Probable BCA candidate");
        }
        else if(OA<75 && CSA>EA){
            System.out.println("Probable B.Sc candidate");
        }
    }
}
