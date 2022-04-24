package Lab_6;
import java.util.Scanner;
/*@author Somit Jain*/
class marks extends Exception{
    marks(String msg){
        super(msg);
    }
}
public class Professor_L6 {
    public static void main(String[] args) throws marks{
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = in.nextInt(),i;
        int[] stud = new int[n];
        for(i=0;i<n;i++){
            stud[i] = in.nextInt();
            if(stud[i]<0 | stud[i]>100){
                throw new marks("Exception caught mark entered is not in the range of 0 to 100");
            }
        }
    }
}
