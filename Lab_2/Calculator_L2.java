package Lab_2;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class Calculator_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float res = a;
        int going=0;
        System.out.println("Enter a choice:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = in.nextInt();
        if(choice==1){
            res=res+b;
        }
        else if(choice==2){
            res=res-b;
        }
        else if(choice==3){
            res=res*b;
        }
        else if(choice==4){
            res=res/b;
        }
        System.out.println("The result is: "+res);
        do{
            System.out.println("Enter a choice:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            choice = in.nextInt();
            System.out.println("Enter the number:");
            b = in.nextFloat();
            if(choice==1){
                res=res+b;
            }
            else if(choice==2){
                res=res-b;
            }
            else if(choice==3){
                res=res*b;
            }
            else if(choice==4){
                res=res/b;
            }
            System.out.println("The result is: "+res);
            System.out.println("To stop press 1 else press 0:");
            going = in.nextInt();
            
        }while(going==0);
        System.out.println("The final output is "+res);
    }
}
