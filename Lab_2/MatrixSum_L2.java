package Lab_2;
import java.util.Scanner;

/**
 *
 * @author Somit Jain
 */
public class MatrixSum_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of square matrix(nxm):");
        int n = in.nextInt();
        int m = in.nextInt();
        int i,j;
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        System.out.println("Enter nxm= "+n*m+" elements of array 1:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter nxm= "+n*m+" elements of array 2:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr2[i][j] = in.nextInt();
                arr2[i][j]=arr2[i][j]+arr1[i][j];
            }
        }
        System.out.println("The addition of 2 matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
