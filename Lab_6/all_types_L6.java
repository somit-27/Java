package Lab_6;
import java.util.Scanner;
public class all_types_L6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter a number 1,2 or 3:");
        int n = in.nextInt();
        try{
            if(n==1){
                System.out.println(n/0);
            }
            else if(n==2){
                String str=null;
                System.out.println(str.length());
            }
            else if(n==3){
                int[] arr = {1,2,3};
                System.out.println(arr[10]);
            }
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught.");
            System.out.println("Name of exception is "+e);
        }catch(NullPointerException f){
            System.out.println("Null Pointer Exception caught.");
            System.out.println("Name of exception is "+f);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Index Out Of Bounds Exception caught.");
            System.out.println("Name of exception is "+a);
        }
    }
}
