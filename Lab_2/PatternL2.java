package Lab_2;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class PatternL2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j;
        //Pattern 1
        System.out.println("20BDS0181 Somit Jain Pattern 1");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Pattern 2
        System.out.println("20BDS0181 Somit Jain Pattern 2");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            for(j=i+1;j<n;j++){
                System.out.print(" ");
            }
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=0;j<=n-i-1;j++){
                System.out.print("*");
            }
            for(j=n-i;j<n;j++){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Pattern 3
        System.out.println("20BDS0181 Somit Jain Pattern 3");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=0;j<=n-i-1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
