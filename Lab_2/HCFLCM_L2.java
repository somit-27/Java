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
public class HCFLCM_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter two numbers:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 0,i;
        for(i=1;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF is: "+hcf);
        int lcm = 0;
        lcm = (a*b)/hcf;
        System.out.println("LCM is: "+lcm);
    }
}
