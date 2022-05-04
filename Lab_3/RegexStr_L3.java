package Lab_3;
import java.util.Scanner;
/*@author Somit Jain*/
public class RegexStr_L3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int flag = 0;
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter Registration Number and Mobile Number:");
        String reg = in.nextLine();
        String mob = in.nextLine();
        if(reg.length()!=9){
            System.out.println("The length of registration number is wrong.");
            flag = 1;
        }
        if(mob.length()!=10){
            System.out.println("The length of mobile number is wrong.");
            flag = 1;
        }
        if(reg.matches("[a-zA-Z0-9]+")==false){
            System.out.println("The registration number contains special characters.");
            flag = 1;
        }
        if(mob.matches("[0-9]+")==false){
            System.out.println("The mobile number doesnt contain only numbers.");
            flag = 1;
        }
        if(flag==0){
            System.out.println("Input is valid.");
        }
    }
}
