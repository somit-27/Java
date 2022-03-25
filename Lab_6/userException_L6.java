package Lab_6;
/* @author Somit Jain*/
import java.util.Scanner;
class zeroNegative extends Exception{
    zeroNegative(String msg){
        super(msg);
    }
}
class range_50_100 extends Exception{
    range_50_100(String msg){
        super(msg);
    }
}
public class userException_L6 {
    static void validate(int n) throws range_50_100,zeroNegative{
        if(n<=0){
            throw new zeroNegative("The number should not be 0 or negative");
        }
        else if(n>=50 & n<=100){
            throw new range_50_100("The number should not be in the range of 50-100");
        }
        else{
            System.out.println("Valid input");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        try{
            System.out.println("Input an integer:");
            int n = in.nextInt();
            try{
                validate(n);
            }catch(zeroNegative z){
                System.out.println("Exception in inner try caught: "+z);
            }            
        }catch(range_50_100 e){
            System.out.println("Exception in outer try caught: "+e);
        }finally{
            System.out.println("Input has been authenticated");
        }
    }
}