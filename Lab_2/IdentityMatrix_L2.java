package Lab_2;
import java.util.Scanner;

/**
 *
 * @author Somit Jain
 */
public class IdentityMatrix_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of square matrix:");
        int n = in.nextInt();
        int i,j,flag=0;
        int[][] arr = new int[n][n];
        System.out.println("Enter "+n*n+" elements of array:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j] = in.nextInt();
                if(i==j && arr[i][j]!=1){
                    flag=1;
                }
                else if(i!=j && arr[i][j]!=0){
                    flag=1;
                }
            }
        }
        System.out.println("The matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        if(flag==1){
            System.out.println("The matrix is not Identity Matrix.");
        }
        else{
            System.out.println("The matrix is Identity Matrix.");
        }
    }
}
