package Lab_2;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class BubbleSort_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total elements in array:");
        int n = in.nextInt();
        int i,j;
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements of array:");
        for(i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Before sorting:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("After sorting:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
